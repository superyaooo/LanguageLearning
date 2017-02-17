/**
 * Serialization provides object persistence
 *  - Files, databases
 *  - Between processes, across networks
 *
 *
 * Requirements to be serializable
 *  - Implement Serializable
 *  - Members are serializable
 *      > Primitive types are serializable
 *      > Others must implement Serializable (for example: String)
 *
 */

public class BankAccount implements Serializable {
    private final String id;
    private int balance = 0;

    public BankAccount(String id) {...}
    public BankAccount(String id, int balance) {...}
    ...
}

// Serializing an Object
BankAccount acct = new BankAccount("1234", 500);
acct.deposit(250);
saveAccount(acct, "account.dat");

void saveAccount(BankAccount ba, String filename){

    try(ObjectOutputStream objectStream =
        new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)))) {

        objectStream.writeObject(ba);
    }
    catch (IOException e) {...}

}

// Deserializing an Object
BankAccount loadAccount(String filename) {

    BankAccount ba = null;

    try(ObjectInputStream objectStream =
        new ObjectInputStream(Files.newInputStream(Paths.get(filename)))){

        ba = (BankAccount)objectStream.readObject();
    }
    catch (IOException e) {...}
    catch (ClassNotFoundException e) {...}
    return ba;
}

BankAccount acct = loadAccount("account.dat");
System.out.println(acct.getId() + " : " + acct.getBalance());


/**
 * Class Version Incompatibility & Create Class Version Compatibility
 *
 * Use serialver utility to get serial version:
 *  c:\mydir> serialver com.jwhh.finance.BankAccount
 *  c:\mydir> serialver -show
 *
 */
public class BankAccount implements Serializable {

    // use same serialVersionUID from the older version of the class
    private static final long serialVersionUID = -6238564483941980673L;

    private final String id;
    private int balance = 0;
    private char lastTxType;
    private int lastTxAmount;
    ...

    public synchronized void deposit(int amount) {
        balance += amount;
        lastTxType = 'd';
        lastTxAmount = amount;
    }

    public synchronized void withdrawal(int amount){
        balance -= amount;
        lastTxType = 'w';
        lastTxAmount = amount;
    }
}

// Customize Serialization
public class BankAccount implements Serializable {

    private final String id;
    private int balance = 0;
    private char lastTxType;
    private int lastTxAmount;
    ...

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream.GetField fields = in.readFields();
        id = (String)fields.get("id", null);
        balance = fields.get("balance", 0);
        lastTxType = fields.get("lastTxType", 'u');
        lastTxAmount = fields.get("lastTxAmount", -1);
    }
}

BankAccount acct2 = loadAccount("account2.dat");    // lastTxType = '\0'; lastTxAmount = 0
BankAccount acct1 = loadAccount("account1.dat");    // lastTxType = 'u'; lastTxAmount = -1

// Transient Fields - use transient to exclude field from serialization
public class AccountGroup {
    private Map<String, BankAccount> accountMap = new HashMap<>();
    private transient int totalBalance;
    public int getTotalBalance() {return totalBalance;}
    public void addAccount(BankAccount account){
        totalBalance += account.getBalance();
        accountMap.put(account.getId(), account);
    }
}

BankAccount acct1 = new BankAccount("1234", 500);
BankAccount acct2 = new BankAccount("9876", 750);
AccountGroup group = new AccountGroup();
group.add(acct1);
group.add(acct2);
saveGroup(group, "group.dat");

void saveGroup(AccountGroup g, String filename){
    try(ObjectOutputStream objectStream =
            new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)))){

        objectStream.writeObject(g);
    }
    catch(IOException e) {...}
}

AccountGroup loadGroup(String filename){
    AccountGroup g = null;

    try(ObjectInputStream objectStream =
        new ObjectInputStream(Files.newInputStream(Paths.get(filename)))){

        g = (BankAccount)objectStream.readObject();
    }
    catch (IOException e) {...}
    catch (ClassNotFoundException e) {...}
    return g;
}

AccountGroup group = loadAccount("group.dat");
System.out.println(group.getTotalBalance());    // 0 - because totalBalance is excluded

// Customize deserialization
public class AccountGroup implements Serializable {
    private Map<String, BankAccount> accountMap = new HashMap<>();
    private transient int totalBalance;
    public int getTotalBalance() {return totalBalance;}
    public void addAccount(BankAccount account){
        totalBalance += account.getBalance();
        accountMap.put(account.getId(), account);
    }

    void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        for(BankAccount account:accountMap.values())
            totalBalance += account.getBalance();
    }
}

AccountGroup group = loadAccount("group.dat");
System.out.println(group.getTotalBalance());    // 1250
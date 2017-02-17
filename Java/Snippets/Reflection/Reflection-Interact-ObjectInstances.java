/**
 * Member Access
 */
void callGetId(Object obj){
    try {
        Class<?> theClass = obj.getClass();
        Method m = theClass.getMethod("getId");
        Object result = m.invoke(obj);
        System.out.println(result);
    }
    catch (Exception e){
        ...
    }
}

BankAccount acct1 = new BankAccount("1234");
callGetId(acct1);

/**
 * Method Access with Reflection
 */
void callDeposit(Object obj, int amt){
    try{
        Class<?> theClass=obj.getClass();
        Method m=theClass.getMethod("deposit",int.class);
        m.invoke(obj,amt);
    }
    catch (Exception e){...}
}

BankAccount acct1 = new BankAccount("1234", 500);
callDeposit(acct1, 50);
System.out.println("Balance: " + acct1.getBalance());   // Balance: 550

/**
 * Create Instance with Reflection
 */
public class BankAccount {
    public String getId() {...}
    public synchronized int getBalance() {...}
    public synchronized void deposit(int amount) {...}
    public synchronized void withdrawal(int amount) {...}
    ...
}
public final class HighVolumeAccount extends BankAccount implements Runnable {
    private int[] readDailyDeposits() {...}
    private int[] readDailyWithdrawals() {...}
    public void run(){
        char txType = // read tx type
        int amt = // read tx amount
        if(txType == 'w')
            ba.withdrawal(amt);
        else
            ba.deposit(amt);
    }
    ...
}

// Worker class
public class AccountWorker implements Runnable{
    BankAccount ba;
    HighVolumeAccount hva;
    public AccountWorker(BankAccount ba){...}
    public AccountWorker(HighVolumeAccount hva){...}
    public void doWork(){
        Thread t = new Thread(hva != null ? hva : this);
        t.start();
    }
}

void startWork(String workerTypeName, Object workerTarget){
    try {
        Class<?> workerType = Class.forName(workerTypeName);
        Class<?> targetType = workerTarget.getClass();
        Constructor c = workerType.getConstructor(targetType);
        Object worker = c.newInstance(workerTarget);
        Method doWork = workerType.getMethod("doWork");
        doWork.invoke(worker);
    } catch (Exception e) {
        ...
    }
}

BankAccount acct1 = new BankAccount();
startWork("com.jwhh.utils.AccountWorker", acct1);

/**
 * Worker Implementing Interface
 */
public class AccountWorker implements Runnable, TaskWorker {
    BankAccount ba;

    public void setTarget(Object target){
        if(BankAccount.class.isInstance(target))
            ba = (BankAccount)target;
        else
            throw nwe IllegalArgumentException(...);
    }

    public void doWork(){
        Thread t = new Thread(
                HighVolumeAccount.class.isInstance(ba) ? (HighVolumeAccount)ba : this);
        t.start();
    }

    public void run(){...}
}

void startWork(String workerTypeName, Object workerTarget){
    try {
        Class<?> workerType = Class.forName(workerTypeName);
        TaskWorker worker = (TaskWorker)workerType.newInstance();
        worker.setTarget(workerTarget);
        worker.doWork();
    } catch (Exception e) { ... }
}

BankAccount acct1 = new BankAccount();
startWork("com.jwhh.utils.AccountWorker", acct1);
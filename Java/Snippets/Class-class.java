/**
 * Class Instance from Type Reference
 */
void showName(Class<?> theClass) {
    System.out.println(theClass.getSimpleName());
}

void doWork(object obj) {
    Class<?> c = obj.getClass();
    showName(c);
}

BankAccount acct = new BankAccount("1234");
doWork(acct);


/**
 * Class Instance from String Name or Type Literal
 */
Class<?> c = Class.forName("com.jwhh.finance.BankAccount");
showName(c);

Class<?> c = BankAccount.class;
showName(c);


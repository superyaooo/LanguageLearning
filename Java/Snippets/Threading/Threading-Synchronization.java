/**
 * Synchronized Methods
 *
 * * Note: constructors are never marked synchronized
 */
public class BankAccount {
    private int balance;
    public BankAccount(int startBalance) {
        balance = startBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }
}

class Worker implements Runnable {
    private BankAccount account;
    ...
    public void run() {
        for(int i=0; i<10; i++) {
            account.deposit(10);
        }
    }
}


/**
 * Manual Synchronization - use synchronized statement blocks
 *
 *  - Provide flexibility
 *      > enables use of non-thread safe classes
 *      > can protect complex blocks of code
 *      > sometimes synchronized methods are not enough
 *
 */
public class BankAccount {
    private int balance;
    ...
    public void deposit(int amount) {
        balance += amount;
    }
}

class Worker implements Runnable {
    private BankAccount account;
    ...
    public void run() {
        for(int i=0; i<10; i++) {
            // lock account with synchronized statement block
            synchronized (account){
                account.deposit(10);
            }
        }
    }
}

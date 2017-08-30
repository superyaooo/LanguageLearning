class BankAccount {
    int balance

    // type 'int' not neccessary
    BankAccount(int openingBalance) {
        this.balance = openingBalance
    }

    void deposit(int amount) {
        this.balance += amount
    }

    void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientFundsException()
        }
        this.balance -= amount
    }
}

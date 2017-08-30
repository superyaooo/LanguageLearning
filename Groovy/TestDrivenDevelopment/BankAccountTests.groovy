/*
JUnit test
*/
import groovy.util.GroovyTestCase

class BankAccountTests extends GroovyTestCase {
    def account

    def void setUp() {
        account = new BankAccount(10)
    }

    def void tearDown() {
        account = null
    }

    def void testCanDepositMoney() {
        // def account = new BankAccount(10)
        account.deposit(5)
        assert 15 == account.balance
    }

    def void testCanWithdrawMoney() {
        account.withdraw(5)
        assert 5 == account.balance
    }

    def void testCanNotWithdrawMoreMoneyThanBalance() {
        shouldFail(InsufficientFundsException) {
            account.withdraw(15)
        }
    }
}

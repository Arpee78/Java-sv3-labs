package algorithmsdecision.bankaccounts;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean withdraw(int withdrawValue) {
        if (withdrawValue > balance) {
            return false;
        }
        balance -= withdrawValue;
        return true;
    }

    public boolean deposit(int depositValue) {
        balance += depositValue;
        return true;
    }
}

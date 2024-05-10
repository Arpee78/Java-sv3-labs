package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int depositValue) {
        balance = balance + depositValue;
    }

    public void withdraw(int withdrawValue) {
        balance = balance - withdrawValue;
    }

    public String getInfo() {
        return owner + " (" + accountNumber + "): " + balance + " Ft";
    }
}

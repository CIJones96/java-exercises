package basics;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Funds");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Chris", 1000.00);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(500.00);
        System.out.println("After Deposit: " + account.getBalance());
        account.withdraw(200.00);
        System.out.println("After withdrawal: " + account.getBalance());
    }
}

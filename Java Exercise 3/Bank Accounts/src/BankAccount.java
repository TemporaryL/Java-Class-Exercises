public class BankAccount{
    
    // Attribute(s)
    protected int accountNumber;
    protected String name;
    protected long balance;
    
    // Constructor(s)
    public BankAccount(int accountNumber, String name, int balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method(s)
    public void display() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(long depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdrawal(long withdrawalAmount) {
        if (balance >= withdrawalAmount){
            balance = balance - withdrawalAmount;
            return;
        }
    }
}
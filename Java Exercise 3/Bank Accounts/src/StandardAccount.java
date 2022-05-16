public class StandardAccount extends BankAccount{
    
    // Attribute(s)
    private int overdraftLimit;
    
    // Constructor(s)
    public StandardAccount(int accountNumber, String name, int balance) {
        super(accountNumber, name, balance);
    }

    // Method(s)
    public void addOverdraft(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void bankFees(){
        balance -= ((balance/100)*5);
    }

    public void withdrawal(long withdrawalAmount) {
        if ((balance - withdrawalAmount) > overdraftLimit){
            balance = balance - withdrawalAmount;
            return;
        }
    }
}
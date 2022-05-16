public class SavingsAccount extends BankAccount{
    
    // Constructor(s)
    public SavingsAccount(int accountNumber, String name, int balance) {
        super(accountNumber, name, balance);
    }

    // Method(s)
    public void withdrawal(long withdrawalAmount) {
        if (withdrawalAmount <= 100){
            super.withdrawal(withdrawalAmount);;
        }
    }

    public void bankFees(){
        balance -= ((balance/100)*0);
    }

    public void accrueInterest(){
        balance += ((balance/100)*5);
    }
}
public class BankUser {
    public static void main(String arg[]){
        BankAccount account = new BankAccount(1, "User Name", 5000);
        account.deposit(100);
        SavingsAccount savings = new SavingsAccount(2, "name", 2500);
    }
}

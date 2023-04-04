public class CheckingAccount extends BankAccount {
    
    private int transCounter;

    public CheckingAccount(String name, double balance, int transCounter) {
        super(name, balance); //Constructor from SuperClass
        transCounter=0;
    }

    @Override
    public void deposit(double amount) {
        transCounter++;
        super.deposit(amount);
        
    }


}

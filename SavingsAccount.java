public class SavingsAccount extends BankAccount {

    private double interestRate;
// Constructor
    public SavingsAccount(String name, double balance, double interestRate) {
         super(name, balance);  //Constructor from Superclass
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance = balance*interestRate;
        
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Interest rate:" + interestRate);

    }



   
    

}

package accounts;

public class SavingsAccount extends Account{
    public SavingsAccount(double balance, double interestRate) {
        //super intializes classes in our inheritance heirarchy
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.25 * amount;
        System.out.println("You withdraw " + amount + " dollars from your Savings Account and are hit with a " + fee + " fee.");
        amount += fee;
        return super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("You have deposited " + amount + " dollars into your Savings Account.");
    }

    @Override
    public void status() {
        System.out.printf("Savings Account \n");
        System.out.printf("\tBalance: %.2f\n", balance);
    }
}

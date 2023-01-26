package accounts;

public class SavingsAccount extends Account{
    public SavingsAccount(double balance, double interestRate) {
        //super intializes classes in our inheritance heirarchy
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.25 * amount;
        amount += fee;
        return super.withdraw(amount);
    }
}

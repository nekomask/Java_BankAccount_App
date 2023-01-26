package accounts;

public class CheckingAccount extends Account{
    //setting a rewards program for checking account
    public int rewardPoints;
    public CheckingAccount(double balance, double interestRate, int rewardPoints){
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }
        public boolean purchase(double cost){
        if (cost > balance){
            return false;
        }

        balance -= cost;
        rewardPoints += cost * 10;
        return true;
        }

    public int getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("You have deposited " + amount + " dollars into your Checking Account.");
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("You withdraw " + amount + " dollars from your Checking Account.");
        return super.withdraw(amount);
    }

    @Override
    public void status() {
        System.out.printf("Checking Account \n");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tReward Point: %d\n", rewardPoints);

    }
}

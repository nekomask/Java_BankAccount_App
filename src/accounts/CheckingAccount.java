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
}

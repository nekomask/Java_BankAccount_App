import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(100, .10, 700);
//Demonstrating the withdraw fee from our Savings account vs Checking account
        CheckingAccount ca = new CheckingAccount(100, .2, 500);
        SavingsAccount sa = new SavingsAccount(100, .2);


        ca.status();
        sa.status();

        ca.withdraw(15.00);
        sa.withdraw(15.00);


        ca.status();
        sa.status();

//Demonstrating the reward points program in our Checking account subclass
        if (account.purchase(10.00)){
            System.out.println("Purchase successful");
        }
        else{
            System.out.println("Purchase failed");
        };
        System.out.println("You now have " + account.getRewardPoints() + " Reward Points.");
        account.status();
    }
}
import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckingAccount account = new CheckingAccount(100, .10, 700);


        //Demonstrating the withdraw fee from our Savings account vs Checking account

        System.out.print("What is the balance of your Checking account?: $");
        double checkingBalance = scanner.nextDouble();

        System.out.print("What is the balance of your Savings account?: $");
        double savingsBalance = scanner.nextDouble();

        System.out.print("What is the interest rate of your Savings account?: ");
        double savingsInterest = scanner.nextDouble();

        CheckingAccount ca = new CheckingAccount(checkingBalance, 0,0);
        SavingsAccount sa = new SavingsAccount(savingsBalance,savingsInterest);

        ca.status();
        sa.status();

        System.out.print("How much would you like to withdraw from your Checking account?: $");
        double checkingWithdraw = scanner.nextDouble();

        ca.withdraw(checkingWithdraw);
        ca.status();

        System.out.print("How much would you like to withdraw from your Savings account?: $");
        double savingsWithdraw = scanner.nextDouble();
        sa.withdraw(savingsWithdraw);
        sa.status();

        System.out.print("How much would you like to deposit into your Checking account?: $");
        double checkingDeposit = scanner.nextDouble();

        ca.deposit(checkingDeposit);
        ca.status();

        System.out.print("How much would you like to deposit into your Savings account?: $");
        double savingsDeposit = scanner.nextDouble();
        sa.deposit(savingsDeposit);
        sa.status();

//Demonstrating the reward points program in our Checking account subclass
        System.out.print("You are making a credit card purchase and paying it from your checking account. How much is your purchase?: $");
        double checkingPurchase = scanner.nextDouble();


        if (ca.purchase(checkingPurchase)){
            System.out.println("Purchase successful");
        }
        else{
            System.out.println("Purchase failed");
        };
        System.out.println("You now have " + ca.getRewardPoints() + " Reward Points.");
        ca.status();
    }
}
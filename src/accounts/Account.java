package accounts;

public class Account {
    private double balance;
    private double interestRate;

    //This is our constructor; constructors with arguments do not get inherited unless called by super()
    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
//method for withdrawing money, takes one parameter- the amount of money to withdraw
    public boolean withdraw(double amount) {
        //if amount to withdraw is greater than our account balance then returns false
    if(amount >balance) {
        System.out.println("Sorry, you don't have enough funds-- you will overdraft your account.");
        return false;
    }
//if doesn't return false, the amount is deducted from our balance
    balance -=amount;
    return true;
}
//method for depositing money; taking the parameter for the amount of money to deposit
        public void deposit (double amount) {
        balance += amount;
        }

//Getters for our balance and interest rate
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    //status method that prints balance on account
    public void status(){
        System.out.printf("Balance: %.2f\n", balance);
    }
}

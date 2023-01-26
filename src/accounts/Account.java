package accounts;

public class Account {
    private double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withdraw(double amount) {
    if(amount >balance)

    {
        return false;
    }

    balance -=amount;
    return true;
}
}

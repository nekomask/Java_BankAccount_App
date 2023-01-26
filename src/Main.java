import accounts.Account;
public class Main {
    public static void main(String[] args) {

        Account account = new Account(100, .02);
        account.status();
        account.withdraw(25.64);
        account.status();
        account.deposit(12.50);
        account.status();
        account.withdraw(85.46);
        account.status();
        account.withdraw(2.99);
        account.status();
    }
}
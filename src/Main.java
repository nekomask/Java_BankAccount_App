import accounts.Account;
import accounts.CheckingAccount;
public class Main {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(100, .10, 700);
        if (account.purchase(10.00)){
            System.out.println("Purchase successful");
        }
        else{
            System.out.println("Purchase failed");
        };
        System.out.println(account.getRewardPoints());
        account.status();
    }
}
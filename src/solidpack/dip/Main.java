package solidpack.dip;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        User user = new User();

        Bank bank = new Bank(account, user);
    }
}

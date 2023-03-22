package solidpack.dip;

public class Bank {

    Account account;
    User user;

    public Bank(Account account, User user) {
        this.account = account;
        this.user = user;
    }
}

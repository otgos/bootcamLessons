package genericsExample;

import java.time.LocalDateTime;

public class Transaction extends BaseClass{
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private LocalDateTime time;
    private Account account;
}

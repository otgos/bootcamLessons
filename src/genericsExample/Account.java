package genericsExample;

public class Account extends BaseClass{

    private Long accountNumber;
    private Double youBalance;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getYouBalance() {
        return youBalance;
    }

    public void setYouBalance(Double youBalance) {
        this.youBalance = youBalance;
    }
}

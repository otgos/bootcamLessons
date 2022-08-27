package enam;

public enum TransactionType {
    DEPOSIT(5),  //0 is ordinal
    WITHDRAW(10),
    TRANSFER(15),
    PAYMENT(20),
    OTHER(100);

    private final int transactionCode;

    public int getTransactionCode() {
        return transactionCode;
    }
    //just private constructor you can create in the enum
    private TransactionType(int code) {
        this.transactionCode=code;
    }
}

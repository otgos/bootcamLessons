package enam;

public class Test {
    public static void main(String[] args) {
        benefitsOfEnumOverConstant();
    }
    private static void benefitsOfEnumOverConstant() {

        constantMethod(1);
        constantMethod(2);
        constantMethod(3);
        constantMethod(4);
        constantMethod(5);

        //constantMethod(6);
        //it doens give any compile time error. But it is not correct for the application
        //because we don't have any Transaction with the value 6

        System.out.println("-------------------------------");

        enumMethod(TransactionType.DEPOSIT);
        enumMethod(TransactionType.WITHDRAW);
        enumMethod(TransactionType.TRANSFER);
        enumMethod(TransactionType.PAYMENT);
        enumMethod(TransactionType.OTHER);


        for (TransactionType tt : TransactionType.values()) {
            System.out.println("Enum Value:"+tt.name().toString());
        }

        //ordinal gives the position in the enum declaration
        System.out.println("Position of Payment:"+TransactionType.PAYMENT.ordinal());


        System.out.println("Transaction Code of the WITHDRAW"+TransactionType.WITHDRAW.getTransactionCode());

        for (TransactionType tt : TransactionType.values()) {
            System.out.println("Enum Value:"+tt.getTransactionCode());
        }


    }

    private static void enumMethod(TransactionType tt) {
        if(tt==TransactionType.DEPOSIT) {
            System.out.println("Money is depositing");
        }else if(tt==TransactionType.WITHDRAW) {
            System.out.println("Money is withdrawing");
        }else if(tt==TransactionType.TRANSFER) {
            System.out.println("Money is transferring");
        }else if(tt==TransactionType.PAYMENT) {
            System.out.println("Money is using for payment");
        }else  {
            System.out.println("Other Transaction");
        }
    }

    private static void constantMethod(int i) {
        if(i==TransactionTypeConstant.DEPOSIT) {
            System.out.println("Money is depositing");
        } else if(i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withdrawing");
        }else if(i==TransactionTypeConstant.TRANSFER) {
            System.out.println("Money is transferring");
        }else if(i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is using for payment");
        }else  {
            System.out.println("Other Transaction");
        }

    }
}

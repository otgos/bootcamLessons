package challange;

public class BankInternal {
    private String accountNumber;
    private double initialBalance;

    public BankInternal(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public  void deposit(String myAccount, double deposit){
        if(accountNumber.equals(myAccount)){
            System.out.println("Your total amount in your account is: " + (initialBalance+deposit));
            setInitialBalance(initialBalance+deposit);
        }else{
            System.out.println("You have entered incorrect account number.");
        }

    }

    public void withdraw(String myAccount, double withdraw){
        if(accountNumber.equals(myAccount)){
            if(initialBalance>=withdraw) {
                System.out.println("You have successfully withdrawn " + withdraw + ". Your remaining balance is " + (initialBalance - withdraw));
            }else {
                System.out.println("You have insufficient remaining balance. Try lesser amount");
            }
        }else{
            System.out.println("You have entered incorrect account number.");
        }

    }
}

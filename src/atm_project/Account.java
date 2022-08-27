package atm_project;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;
    Scanner scanner = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    //calculate checking balance after withdraw
    private double checkinGBalanceAfterWithdraw(){
        return 0;
    }
}

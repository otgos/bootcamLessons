package challange;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner((System.in));
        System.out.println("Please enter your account: ");
        String account = scanner.next();
        System.out.println("Please enter the amount: ");
        double amount = scanner.nextDouble();
        BankInternal acc = new BankInternal("23", 1000.0);
        acc.deposit(account, amount);
        acc.withdraw(account, amount);
    }
}


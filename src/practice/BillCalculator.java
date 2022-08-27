package practice;

import java.util.Scanner;
/*
Write a program that takes input as an electricity unit charges
from the user and calculate the total bill according to the following conditions:
        For the first 50 unit, $0.50/unit
        For the next 100 unit, $0.75/unit
        For the next 100 unit, $1.20/unit
        Unit above 250, $1.50/unit
        add 20% of the tax to the total bill
 */
public class BillCalculator {
    public static void main(String[] args) {
        System.out.println("Enter unit amount :");
        Scanner scanner = new Scanner(System.in);
        double unit = scanner.nextDouble();
        double sum = 0;
        if(unit<=50){
            System.out.println("Your electricity bill is: "+lessFifty(unit)*1.2);
        }else if(unit>50 && unit<=150){
            System.out.println("Your electricity bill is: "+between50And150(unit)*1.2);
        }else if(unit>150 && unit<=250) {
            System.out.println("Your electricity bill is: "+between151And250(unit)*1.2);
        }else {
            System.out.println("Your electricity bill is: "+above250(unit)*1.2);
        }
    }
    public static double lessFifty(double unit){
        double sum = 0;
        sum =  unit*0.5;
        return sum;
    }
    public static double between50And150(double unit){
        double sum = 0;
        sum = (unit-50)*0.75;
        return sum+lessFifty(50);
    }
    public static double between151And250(double unit){
        double sum = 0;
        sum = (unit-150)*1.2;
        return sum+between50And150(150);
    }
    public static double above250(double unit){
        double sum = 0;
        sum = (unit-250)*1.5;
        return sum+between50And150(250);
    }
}

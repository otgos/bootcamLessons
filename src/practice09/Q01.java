package practice09;

import java.util.Scanner;

//Ask user to enter 2 chars and print on console the chars between them.
public class Q01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter second character: ");
        char ch2 = sc.next().charAt(0);

        int first = Math.min(ch1, ch2);
        int second = Math.max(ch1, ch2);
        System.out.println("The chars between "+first+" and " +second);
        for(int i = first+1; i<second; i++){
            System.out.print((char)i+" ");
        }
    }
}

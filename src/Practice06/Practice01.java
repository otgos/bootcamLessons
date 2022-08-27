package Practice06;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter an integer number!");

        int num = scanner.nextInt();
        String ss = scanner.next();
        System.out.println(num%2==0?"Even":"int odd number number: "+String.valueOf(num+3));
    }
}

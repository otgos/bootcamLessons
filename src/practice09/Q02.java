package practice09;
/*
   Take the number of rows from user and print on console the shape based on rows.
                  *
                 * *
                * * *
               * * * *
              * * * * *
    */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = rows-i; j>1; j--){
                System.out.print(" ");
            }
            for(int star = 0; star<=i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

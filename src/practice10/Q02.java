package practice10;

import java.util.Arrays;
import java.util.Scanner;

/*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10
    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0
*/
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }


}

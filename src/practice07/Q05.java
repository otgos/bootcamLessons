package practice07;
/*
        Take the exam point from user and print the grade on console by using switch statement according to the rules below:
          F--> (0.00 - 1.00)
          D--> (1.00 - 2.00)
          C--> (2.00 - 2.50)
          B--> (2.50 - 3.50)
          A--> (3.50 - 4.00)
          (Firsts inclusive - Seconds exclusive)

          in Switch statement we cannot use decimals


         */

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your point: ");
        double point = sc.nextDouble();
        String grade ="";
        if(point>=0 && point<1){
            grade = "Fail";
        } else if(point>=1 && point<2){
            grade="Pass";
        }else if(point>=2 && point<2.5){
            grade="Good";
        }else if(point>=2.5 && point<3.5){
            grade="Superior";
        }else if(point>=3.5 && point<=4){
            grade="Excellent";
        }

        switch (grade){
            case "Fail":
                System.out.println("Grade: F");
                break;
            case "Pass":
                System.out.println("Grade: D");
                break;
            case "Good":
                System.out.println("Grade: C");
                break;
            case "Superior":
                System.out.println("Grade: B");
                break;
            case "Excellent":
                System.out.println("Grade: A");
                break;
            default:
                System.out.println("Enter a valid point");

        }
    }
}

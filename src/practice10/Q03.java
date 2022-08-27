package practice10;

import java.util.Scanner;

/*
    Type code to calculate BMI (Do NOT ignore security).
    The BMI is defined as the body mass divided by the square of the body height.
    Major adult BMI classifications are underweight (under 18.5 kg/m2), normal weight (18.5 to 24.9), overweight (25 to 29.9), and obese (30 or more).
    */
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mass: ");
        double mass = sc.nextDouble();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
        Bmi b = new Bmi(mass, height);
        b.calculateBMI();


    }
}

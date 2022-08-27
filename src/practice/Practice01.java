package practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        String[] studentNames = {"Bella", "Edward", "Jacob", "Alice", "Jessica", "Emmett"};
        int[] studentMarks = {87, 95, 55, 80, 70, 60};
        char[] studentSections = {'A', 'A', 'C', 'B', 'B', 'C'};
        System.out.println("--- Student Details ---");
        System.out.println("Name     Marks    Section");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.printf("%-10s %-10d %-10c\n", studentNames[i], studentMarks[i], studentSections[i]);
        }
        System.out.println("-----------------------");
    }
}

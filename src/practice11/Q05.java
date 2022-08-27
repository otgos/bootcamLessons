package practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
     * Type a program that displays all the 7-day earnings of the market on a daily basis.
     - Type a method that calculate the average amount the market earns this week.
     - Type a method that calculate which days market earns above average.
     - Type a method that calculate which days market earns below average.
     *
     *
     *
     *      Step 2 : Create an ArrayList to which we will add the daily earnings.
     Step 3 : With the while loop, take the 7-day earnings from the user one by one and add them to the daily earnings ArrayList.
     Step 4 : Get the average earnings with the method called averageOfEarnings().
     Step 5 : Create a method called daysAboveAverage().
              Compare all days with average earnings with for loop
              If higher than average earnings, return those days.
     Step 6 : Create a method called daysBelowAverage().
              Compare all days with average earnings with for loop
              If less than average earnings, return those days.

     */


public class Q05 {

    public static double sevenDay(){
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int day = 1;
        for(int i = 0; i<0; i++){
            System.out.println("Enter earning of day " +day);
            double dailyEarning = scanner.nextDouble();
            total+=dailyEarning;
            day++;
        }
        return total;
    }
    public static double averageWeek(){
        return sevenDay()/7;
    }
    static List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    static List<Double> dailyEarnings = new ArrayList<>();
    static double totalEarnings = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        while (day<7){
            System.out.println("Enter dayly earning of "+days.get(day));
            double todaysEarning = scanner.nextDouble();
            dailyEarnings.add(todaysEarning);
            totalEarnings+=todaysEarning;
            day++;
        }
        System.out.println("Daily earning: "+dailyEarnings);
        System.out.println("Days above average earning: "+daysAboveAverage());
        System.out.println("Days below average earning: "+daysBelowAverage());
    }
    private static double averageOfEarning(){
        return totalEarnings/7;
    }
    private static String  daysAboveAverage(){
        String daysAboveAverage = "";
        for(int i = 0 ; i<7; i++){
            if(dailyEarnings.get(i)>averageOfEarning()){
                daysAboveAverage+=days.get(i)+" ";
            }
        }
        return daysAboveAverage;
    }
    private static String  daysBelowAverage(){
        String daysBelowAverage = "";
        for(int i = 0 ; i<7; i++){
            if(dailyEarnings.get(i)<averageOfEarning()){
                daysBelowAverage+=days.get(i)+" ";
            }
        }
        return daysBelowAverage;
    }

 }

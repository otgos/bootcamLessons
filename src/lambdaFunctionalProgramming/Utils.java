package lambdaFunctionalProgramming;

import java.util.List;

public class Utils {
    public static void printInSameLineWithPace(Object obj){
        System.out.print(obj+" ");
    }
    public static boolean isEven(int i){
        return i%2==0;
    }
    public static boolean isOdd(int i){
        return i%2!=0;
    }
    public static int calculateSquare(int a){
        return a*a;
    }
    public static int calculateCube(int a){
        return a*a*a;
    }
    public static double calculateHalf(int a){
        return a/2.0;
    }
    public static char lastChar(String str){
        return str.charAt(str.length()-1);
    }
    public static int findSumOfDigits(int a){
        int sum = 0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}

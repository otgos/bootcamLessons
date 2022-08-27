package lambdaFunctionalProgramming;

import java.util.stream.IntStream;

public class FP04 {
    public static void main(String[] args) {
        findSumOfIntegersFromSevenToHundred();
        findMultiplicationOfIntegersFromTwoToEleven();
        System.out.println(calculateFactorial(5));
        System.out.println(calculateSumOfEvenIntegersInGivenRange(8, -2));
        System.out.println(calculateSumOfDigitsOfEveryIntegersBetweenGivenTwoIntegers(32, 23));
    }
    //1)Create a method to find the sum of integers from 7 to 100
    public static void findSumOfIntegersFromSevenToHundred(){
        //System.out.println(IntStream.range(7, 101).reduce(0, Math::addExact));
        System.out.println(IntStream.rangeClosed(7, 100).sum());
    }
    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static void findMultiplicationOfIntegersFromTwoToEleven(){
        System.out.println(IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact));
    }
    //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int calculateFactorial(int a){
        return IntStream.rangeClosed(1, a).reduce(1, Math::multiplyExact);
    }
    //4)Create a method to calculate the sum of even integers between given two integers
    public static int calculateSumOfEvenIntegersInGivenRange(int a, int b){
        if(b>a){
            return IntStream.rangeClosed(a, b).filter(Utils::isEven).sum();
        }else{
            return IntStream.rangeClosed(b, a).filter(Utils::isEven).sum();
        }
    }
    //5)Create a method to calculate the sum of digits of every integers between given two integers
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
    public static int calculateSumOfDigitsOfEveryIntegersBetweenGivenTwoIntegers(int a, int b){
        if(a<b){
            return IntStream.rangeClosed(a, b).map(Utils::findSumOfDigits).sum();
        }else {
            return IntStream.rangeClosed(b, a).map(Utils::findSumOfDigits).sum();
        }
    }
}

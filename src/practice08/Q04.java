package practice08;
/*
    Create a basic calculator, create add, subtract, multiply, divide methods.
     */
public class Q04 {
    public static void main(String[] args) {

    }
    public static double add(double...a){
        double result = 0;
        for(double i : a){
            result += i;
        }
        return result;
    }
    public static double subtract(double a, double b){
        double result = 0;
        result = a-b;
        return result;
    }
    public static double multiply(double...a){
        double result = 0;
        for(double i : a){
            result *= i;
        }
        return result;
    }
    public static double divide(double a, double b){
        double result = 1;
        if(b!=0){
            result = a/b;
        }
        return result;
    }
}

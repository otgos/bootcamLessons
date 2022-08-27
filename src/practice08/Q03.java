package practice08;
//Create a method to calculate volume of cube, square prism and rectangular prism.
public class Q03 {
    public static void main(String[] args) {
        System.out.println(volumeCalculator(2));
        System.out.println(volumeCalculator(2, 4));
        System.out.println(volumeCalculator(2, 3, 4));
    }

    public static int volumeCalculator(int a){
        return a*a*a;
    }
    public static int volumeCalculator(int a, int b, int c){
        return a*b*c;
    }
    public static int volumeCalculator(int a, int b){
        return a*b*a;
    }
}

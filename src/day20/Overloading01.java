package day20;
/*
        Polymorphism = Overloading + Overriding

        1)We need methods with the "same name" and "different parameters" to make our codes more readable
        This is "method  overloading"
        2)How can you make the parameters different?
            i)By changing the number of parameters
              ==>public static int add(int a, int b){} and public static int add(int a, int b, int c){}
            ii)By changing data types of the parameters
              ==>public static int add(int a, int b){} and public static double add(double a, double b){}
            iii)By changing the order if the data types are different
             ==>public static String add(String a, int b){} and public static String add(int a, String b){}
        3)Can you overload "private" methods?
          Method Overloading is done in a single class, "private" access modifier creates issue if you are
          outside the class. Therefore, doing method overloading will not be problem for private methods.
        4)Can you overload "static" methods?
          "static" methods can be overloaded.
        5)Method Overloading is a part of the "Polymorphism" because we create a method in multiple forms.
 */
public class Overloading01 {

    public static void main(String[] args) {
        System.out.println(Overloading01.add("amana", "emene"));
    }
    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
}

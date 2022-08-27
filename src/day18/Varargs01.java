package day18;
/*
--varargs used ot handle multiple elements in single method
--ny paramater cannot be used after varargs but we can use different param before varargs
-- you cannot use more than one varargs in one method

 */
public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(4, 5));
        System.out.println(add(4, 5, 6, 7, 8));
    }
    public static int add(int...q){
        int sum = 0;
        for(int a :q){
            sum+=a;
        }
        return sum;
    }
}

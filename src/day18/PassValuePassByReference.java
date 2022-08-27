package day18;

public class PassValuePassByReference {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(add(num));
        System.out.println(num);
    }
    public static int add(int num){
        num+=5;
        return num;
    }
}

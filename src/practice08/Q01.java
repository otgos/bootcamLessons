package practice08;
/*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
        */
public class Q01 {
    public static void main(String[] args) {
        System.out.println(add(-1, 4, 5, 6));
    }
    public static int add(int...a){
        int sum = 0;
        for(int i=1; i<a.length; i++){
            sum+=a[i];
        }
        sum=sum*a[0];
        return sum;
    }
}

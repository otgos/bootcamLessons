package practice07;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        String str = "Congratulations";
        char [] arr = new char[str.length()];
        int indx = 0;
        for(int i = arr.length-1; i>=0; i--){
            if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='i'){
                arr[indx]='*';
                indx++;
            } else{
                arr[indx]= str.charAt(i);
                indx++;
            }

        }
        String newS = String.valueOf(arr);
        System.out.println(newS);

    }
}

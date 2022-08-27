package day18;

import java.util.Arrays;
import java.util.Collection;

public class Varargs02 {
    public static void main(String[] args) {
        System.out.println(findMidElement(5, 8, 12, 13));
    }
    public static int findMidElement(int...el){
        Arrays.sort(el);
        int mid = el.length/2;
        if(el.length%2!=0){
            return el[mid];
        }else{
            return (el[mid] + el[mid-1])/2;
        }
    }
}

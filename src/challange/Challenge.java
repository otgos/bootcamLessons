package challange;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 5, 6, 7, 8, 9};
        int[] arr2 = new int[]{2, 6, 4, 6};
        System.out.println(correspondingElelment(arr1, arr2));
    }
    public static int correspondingElelment(int[] arr1, int[] arr2){

        int length = Math.min(arr1.length, arr2.length);
        int count= 0, max=0;
        for(int i =0; i<length; i++){
            if(arr1[i]==arr2[i]){
                count++;
                if(count>max) max = count;
            }else{
                count=0;
            }
        }
        return max;
    }
}

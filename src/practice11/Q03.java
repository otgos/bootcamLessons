package practice11;

import java.util.ArrayList;

//Create a method to take a six element array from user and put the odd numbers into a list and print it.
public class Q03 {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> arr(int[] arr){
        ArrayList<Integer> newList = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2!=0){
                newList.add(arr[i]);
            }
        }
        return newList;
    }
}

package practice07;
//Type a method to check if an int Array is symmetrical or not.
public class Q06 {
    public static void main(String[] args) {
        System.out.println(symmetric(new int[]{5,1, 3, 1, 3, 1, 5}));
    }
    public static boolean symmetric(int[] arr){
        int first = 0;
        int last = arr.length-1;
        boolean result = true;
        while(first<=last){
            if(arr[first]==arr[last]){
                last--;
                first++;
                result = true;
            }else{
                result = false;
                break;
            }
        }
        return result;
    }
}

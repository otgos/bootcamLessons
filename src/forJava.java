import java.util.Arrays;

public class forJava {
    public static void main(String[] args) {
        String friend1 = "John";
        String friend2= "George";
        String friends3 = "Tom";

        String[] friendsArray = new String[3];
        String[] friendsArray1 = {"John", "George", "Tom"};
        friendsArray[1] = "George";
        System.out.println(Arrays.toString(friendsArray));
        System.out.println(Arrays.toString(friendsArray1));

    }
}

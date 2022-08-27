package practiceSession;

import java.util.Locale;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        String string1 = "abcdefghijklmnopqrstuvwyz";
        String string2 = "zywvutsrqponmlkjihgfedcba";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str1 = scanner.nextLine().toLowerCase();
        for(int i = 0; i<str1.length(); i++){
            for(int j=0; j<string1.length(); j++){
                if(str1.charAt(i) == string1.charAt(j)){
                    System.out.print(string2.charAt(j));
                }
            }
        }
    }
}

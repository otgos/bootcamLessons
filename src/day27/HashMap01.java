package day27;

import java.util.HashMap;
import java.util.Map;

//Type code to find the number of occurrences of letters in a String
//"toms are phantoms." ==> t=2 o=2 m=2 s=2 a=2 r=1 e=1 p=1 h=1 n=1

public class HashMap01 {
    public static void main(String[] args) {
        String str ="toms are phantoms.".replaceAll("[^a-zA-Z]", "");
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}

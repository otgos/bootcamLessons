package practice11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Create a method to count the number of  each words in a String one by one.
    input: "Ali came to school and Ayse came to school"
    output: Ali = 1 came = 2 to= 2 school= 2 and= 1 Ayse= 1
 */
public class Q06 {
    public static void main(String[] args) {
        String str = "Ali came to school and Ayse came to school";
        countWords(str);
    }

    public static void countWords(String str){
        Map<String, Integer> map = new HashMap<>();
        String[] newStr = str.split(" ");
        for(String s : newStr){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}

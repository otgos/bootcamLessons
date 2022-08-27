package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Tom Hanks", 13);
        hMap.put("Brad Pitt", 23);
        hMap.put("Angelina Jolie", 12);
        hMap.put("Alex DeSouza", 31);
        System.out.println(hMap);
        Set<String> keys = hMap.keySet();
        //How many letters were used in all names?
        int totalLetters = 0;
        for(String s : keys){
            totalLetters+=s.replaceAll("[^a-zA-Z]", "").length();
        }
        System.out.println(totalLetters);
        //Find average age of the students
        Collection<Integer> vals = hMap.values();
        int sum = 0;
        for(Integer i : vals){
            sum+=i;
        }
        System.out.println((double) sum/vals.size());
        System.out.println(hMap.get("Alex DeSouza"));
    }
}

package day27;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Tom", 3);
        ht.put("Hanks", 4);
        System.out.println(ht);
    }
}

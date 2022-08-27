package day27;

import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(12, "Tom");
        tm.put(10, "Hanks");
        tm.put(1, "George");
        System.out.println(tm);
    }
}

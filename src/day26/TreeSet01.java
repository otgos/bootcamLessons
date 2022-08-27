package day26;

import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("Apple");
        tSet.add("Orange");
        tSet.add("Watermelon");
        tSet.add("Banana");
       // tSet.add(null);
        System.out.println(tSet);
        System.out.println(tSet.subSet("Apple", true, "Orange", true));
        TreeSet<String> sub = (TreeSet<String>) tSet.subSet("Apple", "Orange");
        System.out.println(tSet.floor("Bana"));

    }
}

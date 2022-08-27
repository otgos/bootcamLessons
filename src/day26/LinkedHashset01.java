package day26;

import java.util.LinkedHashSet;

public class LinkedHashset01 {
    public static void main(String[] args) {
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("A");
        lSet.add("B");
        lSet.add("LK");
        lSet.add("?");
        lSet.add(null);
        System.out.println(lSet);

    }
}

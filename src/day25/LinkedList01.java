package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addFirst("O");
        linkedList.addLast("ABKA");
        linkedList.add(1, "Lasasasa");
        linkedList.peek();
        System.out.println(linkedList);
    }

}

package day26;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String> queue01 = new LinkedList<>();
        queue01.add("Milk");
        queue01.add("Sara");
        queue01.add("Tom Hanks");
        queue01.add("Glenn");
        queue01.add("Ronald");
        System.out.println(queue01);
        queue01.remove();
        System.out.println(queue01.element());
        System.out.println(queue01.peek());
        queue01.offer("Otgo");
        System.out.println(queue01.poll());
        System.out.println(queue01);
    }
}

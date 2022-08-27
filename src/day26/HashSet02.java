package day26;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet02 {
    public static void main(String[] args) {
        int time1 = LocalTime.now().getNano();
        HashSet <Integer> hSt = new HashSet<>();
        for(int i =  10000; i>0; i--){
            hSt.add(i);
        }
        TreeSet<Integer> tSet = new TreeSet<>(hSt);
        int time2 = LocalTime.now().getNano();

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i =  10000; i>0; i--){
            hSt.add(i);
        }
        int time3 = LocalTime.now().getNano();
        System.out.println("HashSet to Tree set time: "+ (time2-time1));
        System.out.println("Tree Set time: "+ (time3-time2));

    }
}

package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    Create a method to add 10 random integers from 0 to 20 into a List. Convert even numbers to 111.
    If there is no even number print on console "There is no even number".
    */
public class Q06 {
    public static void main(String[] args) {
        addRandomInts();
        addRandomInts();
    }

        public static void addRandomInts(){
            int count=0;
            while(true){
                List<Integer> list = new ArrayList<>();
                for(int i=0; i<10; i++){
                    list.add(((int)(Math.random()*20)));
                }
                System.out.println(list);
                for(int i=0; i<10; i++){
                    if(list.get(i)%2==0){
                        list.set(i, 111);
                        count++;
                    }
                }
                System.out.println(list);
                if(count==0) {
                    System.out.println("There is no even number");
                }
            }


        }



}

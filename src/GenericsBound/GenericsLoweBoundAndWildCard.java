package GenericsBound;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsLoweBoundAndWildCard {
    public static void main(String[] args) {
        List<Object> ol = new ArrayList<>();
        addNumber(ol);
        ol.forEach(o->System.out.println(o));

        List<Number> ln = new ArrayList<>();
        addNumber(ln);
        ol.forEach(o->System.out.println(o));

        List<Integer> li = new ArrayList<>();
        addNumber(li);
        ol.forEach(o->System.out.println(o));

        addNumber3(ol);
        ol.forEach(o->System.out.println(o));

    }
    public  static void addNumber(List<? super Integer> list){
        for (int i=0; i<=10; i++){
            list.add(i);
        }
    }
    public static void addNumber2(List<?>myList){
        //myList.add("Java"); //it gives compile time error
       // myList.add(1);
        myList.add(null);

    }
    public static void addNumber3(List<Object> myList){
        myList.add(10);
        myList.add("Java");

    }
}

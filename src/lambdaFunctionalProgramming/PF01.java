package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1)Create a method to print the list elements on the console in the same line with a space
//  between two consecutive elements.(Structured)
public class PF01 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(9);
        l.add(21);
        l.add(12);
        l.add(9);
        l.add(8);
        l.add(8);
        l.add(3);
        printListElementsStructured(l);
        System.out.println();
        printListElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOdElementsFunctional(l);
        System.out.println();
        printCubeOfDistinctOddElement(l);
        System.out.println();
        calculateSumOfSquaresOfDistinctEvenElements(l);
        System.out.println();
        calculateProductOfCubesOfDistinctEvenElement(l);
        maxValue(l);
        maxValue2(l);
        getMinimumGreaterThanSeven(l);
        findHalfOfElementsDistinctAndGreaterThan5(l);
    }
    public static void printListElementsStructured(List<Integer> list){
        for(Integer i : list){
            System.out.print(i+" ");
        }
    }
    public static void printListElementsFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
    }
    public static void printEvenElementsStructured(List<Integer> list){
        for(Integer i : list){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOdElementsFunctional(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    public static void printCubeOfDistinctOddElement(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void calculateSumOfSquaresOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter((t->t%2==0)).map(t->t*t).reduce(0, (t, u)->t+u);
        System.out.println(sum);
    }
    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void calculateProductOfCubesOfDistinctEvenElement(List<Integer> list){
        Integer product = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t, u)->t*u);
        System.out.println(product);
    }
    //7)Create a method to find the maximum value from the list elements
    //1st way
    public static void maxValue(List<Integer>list){
        System.out.println(list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)->t>u?t:u));
    }
    //2nd way
    public static void maxValue2(List<Integer>list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u)->u);
        System.out.println(max);
    }
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinimumGreaterThanSeven(List<Integer> list){
        Integer min = list.stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                reduce(Integer.MAX_VALUE,(t, u)->t<u?t:u);
        System.out.println(min);
    }
    //2nd way
    public static void getMinimumGreaterThanSeven02(List<Integer> list){
        Integer min = list.stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t, u)->t<u?t:u);
        System.out.println(min);
    }
    //3rd way
    public static void getMinimumGreaterThanSeven03(List<Integer> list){
        Integer min = list.stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted().
                findFirst().
                get();
        System.out.println(min);
    }
    //10)Create a method to find the half of the elements which are distinct and
    //   greater than 5 in reverse order in the list.
    public static void findHalfOfElementsDistinctAndGreaterThan5(List<Integer> list){
        List<Double> result = list.stream().
                distinct().
                filter(t->t>5).
                map(t->t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(result);
    }
}

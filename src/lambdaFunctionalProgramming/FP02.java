package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Homework
//8)Create a method to find the minimum value from the list elements(In 2 ways)
public class FP02 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(9);
        l.add(21);
        l.add(12);
        l.add(9);
        l.add(8);
        l.add(8);
        l.add(3);
        printListElementsFunctional(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOdElementsFunctional(l);
        System.out.println();
        printCubeOfDistinctOddElement(l);
        System.out.println();
        calculateSumOfSquaresOfDistinctEvenElements(l);
        calculateProductOfCubesOfDistinctEvenElement(l);
        maxValue(l);
        getMinimumGreaterThanSeven(l);
        findHalfOfElementsDistinctAndGreaterThan5(l);

    }
    public static void printListElementsFunctional(List<Integer> list){
        list.stream().forEach(Utils::printInSameLineWithPace);
    }
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(Utils::isEven).forEach(Utils::printInSameLineWithPace);
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOdElementsFunctional(List<Integer> list){
        list.stream().filter(Utils::isOdd).map(Utils::calculateSquare).forEach(Utils::printInSameLineWithPace);
    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    public static void printCubeOfDistinctOddElement(List<Integer> list){
        list.stream().distinct().filter(Utils::isOdd).map(Utils::calculateCube).forEach(Utils::printInSameLineWithPace);
    }
    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void calculateSumOfSquaresOfDistinctEvenElements(List<Integer> list){
        int sum = list.stream().distinct().filter(Utils::isEven).map(Utils::calculateSquare).reduce(0, Math::addExact);
        int sum1 = list.stream().distinct().filter(Utils::isEven).map(Utils::calculateSquare).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum1);
    }
    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void calculateProductOfCubesOfDistinctEvenElement(List<Integer> list){
        int product = list.stream().distinct().filter(Utils::isEven).map(Utils::calculateCube).reduce(1, Math::multiplyExact);
        System.out.println(product);
    }
    //7)Create a method to find the maximum value from the list elements
    //1st way
    public static void maxValue(List<Integer>list){
       int max =  list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }
    //8)Create a method to find the minimum value from the list elements(In 2 ways)
    public static void findMinimumValue(List<Integer> list){
        int min = list.stream().distinct().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinimumGreaterThanSeven(List<Integer> list){
        int min = list.stream().distinct().filter(t->t>7).filter(Utils::isEven).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }
    //10)Create a method to find the half of the elements which are distinct and
    //   greater than 5 in reverse order in the list.
    public static void findHalfOfElementsDistinctAndGreaterThan5(List<Integer> list){
        List<Double> result = list.
                stream().
                distinct().
                filter(t->t>5).
                map(Utils::calculateHalf).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(result);
    }
}

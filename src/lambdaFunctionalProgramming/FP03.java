package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//1) Create a method to print all list elements in uppercase
public class FP03 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        printUpperCase(l);
        System.out.println();
//        printUpperCase02(l);
        sortAccordingToLength(l);
        System.out.println();
        sortAccordingToLengthReverse(l);
        System.out.println();
        sortDistinctByLastChars(l);
        System.out.println();
        printSortedByLengthThenSortedByInitials(l);
        System.out.println();
//        removeElementIfLengthGreaterThanFive(l);
        //removeIfStartingAOrEndingWithN(l);
        //removeElementsIfLengthBtwEightAndTenOrEndWithO(l);
        System.out.println(checkIfLengthOfElementLessThanTwelve(l));
        System.out.println(checkIfInitialsIsX(l));

    }
    //1st way
    public static void printUpperCase(List<String> str){
        str.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithPace);
    }
    //2nd way
//    public static void printUpperCase02(List<String> str){
//        str.replaceAll(String::toUpperCase);
//        System.out.println(str);
//    }
    //2) Create a method to print the elements after ordering according to their lengths
    public static void sortAccordingToLength(List<String> str){
        str.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithPace);
    }
    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void sortAccordingToLengthReverse(List<String> str){
        str.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithPace);
    }
    //4) Create a method to sort the distinct elements by using their last characters
    public static void sortDistinctByLastChars(List<String> str){
        str.stream().distinct().sorted(Comparator.comparing(Utils::lastChar)).forEach(Utils::printInSameLineWithPace);
    }
    //5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printSortedByLengthThenSortedByInitials(List<String> str){
        str.
                stream().
                sorted(Comparator.comparing(String::length).
                        thenComparing(t->t.charAt(0))).
                forEach(Utils::printInSameLineWithPace);
    }
    //6) Remove the elements if the length of the element is greater than 5
    public static void removeElementIfLengthGreaterThanFive(List<String> str){
        str.removeIf(t->t.length()>5);
        System.out.println(str);
    }
    //7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’
    public static void removeIfStartingAOrEndingWithN(List<String> str){
        //str.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
        //or
        str.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(str);
    }
    //8) Remove the elements if the length is between 8 and 10 or ending with 'o'
    public static void removeElementsIfLengthBtwEightAndTenOrEndWithO(List<String> str){
        Predicate<String> checkCondition =t->(t.length()>=8 && t.length()<=10) || t.endsWith("o");
        str.removeIf(t->checkCondition.test(t));
        System.out.println(str);
    }
    //9) Create a method to check if the lengths of all elements are less than 12
    public static boolean checkIfLengthOfElementLessThanTwelve(List<String> str){
        return str.stream().allMatch(t->t.length()<12);
    }
    //10) Create a method to check if the initial of any element is not ‘X’
    public static boolean checkIfInitialsIsX(List<String> str){
        return str.stream().noneMatch(t->t.charAt(0)=='X');
    }
}

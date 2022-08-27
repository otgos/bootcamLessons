package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        System.out.println("areAllAverageScoresGreaterThanGivenNumber: "+areAllAverageScoresGreaterThanGivenNumber(coursesList, 90));
        System.out.println("isAnyCourseNameContainsGivenWord: "+isAnyCourseNameContainsGivenWord(coursesList, "DAY"));
        System.out.println(printCourseWhoseAverageIsHighest(coursesList));
        System.out.println(sortListElementsAccordingToAverageInAscendingOrderAndSkipFirstGiven(coursesList, 3));
    }
    //1)Create a method to check if all average scores are greater than given number
    public static boolean areAllAverageScoresGreaterThanGivenNumber(List<Courses> list, double avgScore){
        return list.stream().allMatch(t->t.getAverageScore()>avgScore);
    }
    //2)Create a method to check if at least one of the course names contains given word
    public static boolean isAnyCourseNameContainsGivenWord(List<Courses> list, String word){
        return list.stream().anyMatch(t->t.getCourseName().contains(word));
    }
    //3)Create a method to print the course whose average score is the highest
    public static String printCourseWhoseAverageIsHighest(List<Courses> list){
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }
    //4)Sort the list elements according to the average score in ascending order and skip first given
    public static List<Object> sortListElementsAccordingToAverageInAscendingOrderAndSkipFirstGiven(List<Courses> list, int skip){
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(skip).collect(Collectors.toList());
    }
}

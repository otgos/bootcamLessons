package practice09;
/*
	Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */
public class Q05 {
    public static void main(String[] args) {

        calculateAverage("Otgo", 65, 100, 100);
        calculateAverage("Otgo", 100, 100, 100);

    }

    public static void calculateAverage(String name, double... exams){
        double sum=0;
        for(double ex: exams){
            sum+=ex;
        }
        System.out.println("The average of student "+name+ " is "+String.format("%.2f", sum/exams.length));
    }
}

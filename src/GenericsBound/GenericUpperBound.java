package GenericsBound;
//we can specify that a method accept a type an all its subclasses (upper bound)
public class GenericUpperBound <T extends Number>{

    T[] numberArray;

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }
    public double getAverage(){
        double sum = 0;
        for(int i = 0; i<numberArray.length; i++){
            sum+=numberArray[i].doubleValue();
        }
        double avg = sum/numberArray.length;
        return avg;
    }


    public static void main(String[] args) {

        Integer[] intArr = {2, 45, 5, 34};
        GenericUpperBound<Integer> gub = new GenericUpperBound<>(intArr);
        System.out.println("Integer array average: "+gub.getAverage());

        Double[] doubleArr = {2.34, 45.565, 5.34, 34.454};
        GenericUpperBound<Double> doub = new GenericUpperBound<>(doubleArr);
        System.out.println("Double array average: "+doub.getAverage());
    }
}

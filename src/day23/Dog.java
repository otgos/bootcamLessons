package day23;

public class Dog extends Mammal {
    public Dog() {
        super(133);
        System.out.println("Dog construrctor created..");
    }
    public Dog(int i){

        this();

        System.out.println("Dog construrctor with nuber .."+i);
    }
}

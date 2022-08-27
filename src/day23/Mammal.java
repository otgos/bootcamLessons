package day23;

public class Mammal extends Animal {
    public Mammal() {
        System.out.println("Mammal constructor created..");
    }
    public Mammal(int str){
        super("Caaaat");
        System.out.println("Mammal constructor having paramaeter of "+ str +"  Worked");
    }
}

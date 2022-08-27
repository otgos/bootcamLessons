package day23;

public class Cat extends Mammal {

    public Cat(){
        System.out.println("Cat constructor started...");
    }
    public Cat(String str){

        super(12);
        System.out.println("Animal constructor having paramaeter of "+ str +"Worked");
    }
}

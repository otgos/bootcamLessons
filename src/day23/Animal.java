package day23;

public class Animal {
    public Animal(){
        System.out.println("Animal constructor worked...");
    }
    public Animal(String str){
        this();
        System.out.println("Animal constructor having paramaeter of "+ str +"Worked");
    }
}

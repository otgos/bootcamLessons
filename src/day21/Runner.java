package day21;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
        cat.drink();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.drink();
        dog.weight();

        Object obj = new Object();
    }
}

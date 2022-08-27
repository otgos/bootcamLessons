package Generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {
    static List<Animal> list = new ArrayList<>();
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Dog dog = new Dog();

        method(animal);
        method(cat);
        method(dog);

        for(Animal animal1: list){
            animal1.eat();
        }
    }
    private static void method(Animal a){
        list.add(a);
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal eating...");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eating...");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eating...");
    }
}
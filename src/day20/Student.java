package day20;
/*
        1) Object-Oriented Programming Language (OOP) has 4 main principals.
            i) Encapsulation
            ii) Polymorphism
            iii) Inheritance
            iv) Abstraction

        2) Encapsulation :
            a) Data hiding. Some data should be hidden.
            b) Makes code readable.
            c) Makes code flexible

        3) How to hide data?
            By using private access modifier we can hide data.

        4) After hiding data how can you use it?
            After hiding data by the help of getters I can access to encapsulate data.


        Notes on Getter methods:
            Should have public accessor
            Return type should be the same with the data type of the variable
            getter methods are named like "get" + capitalized variable name, but data type is boolean it will be is+var name
            getther methods do not use any paramater because they return the value of existing variable

       5) After hiding data how to update data?
            By the help of setter method
 */

import java.time.LocalDate;
import java.util.Locale;

public class Student {
    private String name = "Tom Hanks";

    public String getName() {
        name=name.toUpperCase(Locale.ROOT);
        return name;
    }
    private int age = 14;
    private int yearBorn =1990;

    public int getYearBorn() {
        return yearBorn;
    }

    public int getAge() {
        return age;
    }
    private boolean isSuccessful = true;

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setAge(int age) {
        int currYear = Integer.valueOf(LocalDate.now().getDayOfYear());
        age = currYear-yearBorn;
        this.age = age;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearBorn=" + yearBorn +
                ", isSuccessful=" + isSuccessful +
                '}';
    }

    public Student(String name, int age, int yearBorn, boolean isSuccessful) {
        this.name = name;
        this.age = age;
        this.yearBorn = yearBorn;
        this.isSuccessful = isSuccessful;
    }

    public Student() {
    }
}

package day20;
/*
        1) Constructors are used to create an object from class.
        If there is constructor, it is impossible to create an object form a class.

        2) Java knows classes are for object creations,
        because of that Java puts constructor in every class automatically.
        Constructor coming from Java is invisible, and it is called default constructor.
        Default constructor syntax: Class (same class)name(){}. and default constructor has public access modifier.

        3) Java is jealous, when you create your own constructor Java deletes the default constructor.

        4) Difference between "constructors" and "methods"??
            i) "Constructors" are for object creations but "methods" are for some actions.
            ii) "Constructors" don't have return type, but methods must have data type.
            iii) The name of "Constructors" must match with name of class. But "methods" can get any name.

 */
public class Vehicles {
    String make;
    String model;
    int year;
    double price;

    public  Vehicles(){}
    public Vehicles(String make, String model, int year, double price){

        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }
    public Vehicles(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }
}

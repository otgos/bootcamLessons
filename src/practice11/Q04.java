package practice11;

import java.util.HashMap;

/*
        Print two arrays which contains firstname and lastname as the format : firstname=lastname
            input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
            output : {John=Doe, Mark=Twain, Ali=Can};
         */
public class Q04 {
    public static void main(String[] args) {
        String[] firstName = {"John", "Mark", "Ali"};
        String[] lastName = {"Doe", "Twain", "Can"};
        HashMap<String, String> name = new HashMap<>();
        for(int i = 0; i<firstName.length; i++){
            name.put(firstName[i], lastName[i]);
        }
        System.out.println(name);
    }
}

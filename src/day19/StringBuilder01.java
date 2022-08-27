package day19;

public class StringBuilder01 {
    /*
            - String class is immutable, but sometimes we need mutable Strings,
            because of that Java created string builder adn string buffer classes.

            There is string pool in java. When we create string java will check heap memory first, and if that
            string is already there, then just creates reference.

            Garbage collector--> it scans data all the time. If it finds any obj without reference,
             it destroys it.
             If we create different String with the same value we use a "new" keyboard.
             When there is multiple references point the same object, and when we update object
             only that object will be affected. To prevent all strings to be updated Java created immutability.

             if any object has not got pointer, Garbage Collector will delete it to save memory

             "==" --> checks value and address
             "equal"--> a method to check just values.
     */
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        str1 = "Mava";
        System.out.println(str1==str2);

        StringBuilder stringBuilder = new StringBuilder("Tom");
        stringBuilder.append("Hanks");
        System.out.println(stringBuilder);
    }
}

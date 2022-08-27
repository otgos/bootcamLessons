package day29;

public class E01 {
    public static void main(String[] args) {
        try{
            setAge(-3);
        }catch (IllegalArgumentException e){
            System.out.println("Age cannot be less than 0");
        }
        setAge(14);
    }
    public static void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println(age);
        }
    }
}

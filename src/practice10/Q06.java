package practice10;
/*
        Type code to calculate area of rectangle and triangle.(Use abstraction)
     */
public class Q06 extends Q06Abstract {
    public static void main(String[] args) {
        Q06 q = new Q06();
        System.out.println(q.rectangeArea(4, 5));
        System.out.println(q.triangleArea(4, 5));

    }

    @Override
    public double triangleArea(double base, double height) {
        return base*height/2;
    }

    @Override
    public double rectangeArea(double height, double length) {
        return height*length;
    }
}

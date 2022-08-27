package epam;

public class Circle extends Figure{

    Point a;
    Point b;
    Point c;

    public Circle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String pointsToString() {
        return null;
    }

    @Override
    public Point leftmostPoint() {
        return null;
    }
}

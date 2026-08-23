class Shape {

    final String SHAPE_TYPE = "2D";

    double area() {
        return 0;
    }
}

class Polygon extends Shape {

    @Override
    double area() {
        return -1;
    }
}

class Rectangle extends Polygon {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

public class Q8 {
    public static void main(String[] args) {

        Shape s = new Shape();
        Polygon p = new Polygon();
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Shape Area: " + s.area());
        System.out.println("Polygon Area: " + p.area());
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Shape Type: " + r.SHAPE_TYPE);
    }
}
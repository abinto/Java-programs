abstract class Shape {

    abstract void area();

}
class Circle extends Shape {

    int radius = 5;

    void area() {

        double result = 3.14 * radius * radius;

        System.out.println("Area of Circle = " + result);
    }

}
public class Main {

    public static void main(String[] args) {

        Shape s = new Circle();

        s.area();

    }

}
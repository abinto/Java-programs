abstract class Shape {

    abstract void area();
}

class Rectangle extends Shape {

    int length = 10;
    int width = 5;

    @Override
    void area() {
        System.out.println("Rectangle area = " + (length * width));
    }
}

class Circle extends Shape {

    int radius = 7;

    @Override
    void area() {
        System.out.println("Circle area = "
                + (Math.PI * radius * radius));
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        s1.area();
        s2.area();
    }
}
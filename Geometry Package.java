interface Shape2D {

    double area();

    double perimeter();
}

class Square implements Shape2D {

    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Triangle implements Shape2D {

    double base;
    double height;
    double side1;
    double side2;
    double side3;

    Triangle(double base, double height,
             double side1, double side2, double side3) {

        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class Q12 {

    public static void main(String[] args) {

        Square s = new Square(5);

        Triangle t = new Triangle(6, 4, 5, 5, 6);

        System.out.println("Square Area: " + s.area());
        System.out.println("Square Perimeter: " + s.perimeter());

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());
    }
}
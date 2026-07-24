class Shape {

    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {

    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

class Rectangle extends Shape {

    void area() {
        System.out.println("Area of Rectangle = length × breadth");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        System.out.println();

        r.display();
        r.area();
    }
}
import java.util.Scanner;

public class Rectangle {

    private double length;
    private double width;

    public void setDimensions() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Length : ");
        length = sc.nextDouble();

        System.out.print("Width : ");
        width = sc.nextDouble();
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class Main {

    public static void main(String[] args) {

        Rectangle[] rect = new Rectangle[3];

        // Create objects and read dimensions
        for (int i = 0; i < rect.length; i++) {

            rect[i] = new Rectangle();

            System.out.println("Rectangle " + (i + 1));
            rect[i].setDimensions();
            System.out.println();
        }

        // Display area and perimeter
        System.out.println("Rectangle Details");

        for (int i = 0; i < rect.length; i++) {

            System.out.println("Rectangle " + (i + 1));
            System.out.println("Area : " + rect[i].calculateArea());
            System.out.println("Perimeter : " + rect[i].calculatePerimeter());
            System.out.println();
        }
    }
}
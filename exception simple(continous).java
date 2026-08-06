import java.util.Scanner;

public class InputValidationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        while (true) {
            System.out.print("Enter your age: ");

            if (sc.hasNextInt()) {   //Preventing invalid input
                age = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next();   // Remove the invalid input
            }
        }

        System.out.println("Your age is: " + age);

        sc.close();
    }
}

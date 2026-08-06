import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputErrorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Your age is: " + age);
        }
       catch (InputMismatchException e) {
       //   catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}

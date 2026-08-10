import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        while (true) {

            System.out.print("Enter an integer: ");

            if (sc.hasNextInt()) {

                number = sc.nextInt();
                break;

            } else {

                System.out.println("Invalid input!");
                sc.next();
            }
        }

        System.out.println("You entered: " + number);

        sc.close();
    }
}
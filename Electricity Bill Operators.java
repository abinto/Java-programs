import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int unitsConsumed = sc.nextInt();

        System.out.print("Enter previous due amount: ");
        double previousDueAmount = sc.nextDouble();

        double bill;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 3;
        } else {
            bill = (100 * 3) + ((unitsConsumed - 100) * 5);
        }

        boolean flagged =
                unitsConsumed > 300 && previousDueAmount > 0;

        System.out.println("Electricity Bill = Rs. " + bill);

        if (flagged) {
            System.out.println("Customer Flagged");
        } else {
            System.out.println("Customer Not Flagged");
        }

        int count = 5;

        System.out.println(++count);
        // ++count increases first, then prints.
        // count becomes 6.

        count = 5;

        System.out.println(count++);
        // count++ prints first, then increases.
        // Prints 5, then count becomes 6.

        sc.close();
    }
}
import java.util.Scanner;

public class NumberPatternAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int evenSum = 0;
        int oddCount = 0;
        int largestMultipleOf5 = 0;

        System.out.print("Numbers : ");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");

            if (i % 2 == 0) {
                evenSum = evenSum + i;
            }

            if (i % 2 != 0) {
                oddCount++;
            }

            if (i % 5 == 0) {
                largestMultipleOf5 = i;
            }
        }

        System.out.println();
        System.out.println("Sum of Even Numbers : " + evenSum);
        System.out.println("Odd Count : " + oddCount);
        System.out.println("Largest Multiple of 5 : " + largestMultipleOf5);

        sc.close();
    }
}
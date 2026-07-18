import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        // Check each character
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                hasUpper = true;

            if (Character.isLowerCase(ch))
                hasLower = true;

            if (Character.isDigit(ch))
                hasDigit = true;
        }

        // Validate password
        if (password.length() >= 8 && hasUpper && hasLower && hasDigit)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");

        sc.close();
    }
}
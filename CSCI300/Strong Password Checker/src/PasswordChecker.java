import java.util.Scanner;

public class PasswordChecker {

    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (ch == '@' || ch == '#' || ch == '$') {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();
            
            if (isStrongPassword(password)) {
                System.out.println("Password is fine.");
                break;
            } else {
                System.out.println("Password is not strong. Try again");
            }
        }
        scanner.close();
    }
}

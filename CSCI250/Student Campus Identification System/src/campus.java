import java.util.Scanner;

public class campus {

    public static String analyzeID(int D) {
        int n = D / ((int) Math.pow(10, (int) Math.log10(D)));
        if (n == 1) {
            return "Beirut";
        } else if (n == 2) {
            return "Saida";
        } else {
            return "Other campuses";
        }
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int students = s.nextInt();

            for (int i = 0; i < students; i++) {
                System.out.print("Enter ID of the student " + (i + 1) + ": ");
                int D = s.nextInt();
                int count = 0;
                int num = D;
                while (num != 0) {
                    num /= 10;
                    ++count;
                }
                if (count == 8) {
                    System.out.println("Student campus is: " + analyzeID(D));
                } else {
                    System.out.println("Invalid ID length");
                }
            }
        }
    }
}

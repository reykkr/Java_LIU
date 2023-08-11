import java.util.Scanner;

public class point {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] y = new int[4];
            for (int i = 0; i < y.length; i++) {
                System.out.println("Enter y[" + i + "]: ");
                y[i] = s.nextInt();
            }
            int x;
            System.out.println("Enter x: ");
            x = s.nextInt();
            
            for (int i = 0; i < y.length; i++) {
                if (2 * x + 1 > y[i]) {
                    System.out.println("Point (" + x + ", " + y[i] + ") is above the line.");
                }
            }
        }
    }
}

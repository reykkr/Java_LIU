import java.util.Scanner;

public class character {
    
    public static void pattern(char alpha, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(alpha);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            char n;
            int m;
            
            System.out.println("Enter a character: ");
            n = s.next().charAt(0);
            
            m = s.nextInt();
            if (m < 0) {
                System.out.println("Wrong entry");
            } else {
                pattern(n, m);
            }
        }
    }
}
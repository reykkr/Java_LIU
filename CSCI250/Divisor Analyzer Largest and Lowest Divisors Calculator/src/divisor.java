import java.util.Scanner;

public class divisor {

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            int num;
            
            System.out.println("Enter a number: ");
            num = s.nextInt();
            
            System.out.println("The largest divisor is: " + findDivisor(num, false));
            System.out.println("The lowest divisor is: " + findDivisor(num, true));
            
            s.close();
        }
    }
 
    public static int findDivisor(int num, boolean lowest) {
        
        int divisor;
        
        if (lowest) {
            for (divisor = 2; divisor <= num; divisor++) {
                if (num % divisor == 0) {
                    break;
                }
            }
        } else {
            for (divisor = num - 1; divisor > 1; divisor--) {
                if (num % divisor == 0) {
                    break;
                }
            }
        }
        
        return divisor;
    }
}

import java.util.Scanner;

public class octagon {

       static double octagonArea (double side){
           return (float)(2 * (1 + Math.sqrt(2)) * side * side);
            
        }
       public static void main (String arg[]){
           try (Scanner s = new Scanner (System.in)) {
            System.out.println("Enter the ");
               double side = s.nextDouble();
               System.out.println("Area of octagon is: " + octagonArea(side));
        }
       }
}

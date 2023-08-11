import java.util.Scanner;

public class Software {
   
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner (System.in)) {
            System.out.println("Enter the number of users :");
            int u = s.nextInt();
            
            System.out.println("Enter the license type (0 or 1):");
            int L = s.nextInt();
            
            if (L==0 || L==1){
                
                if (L ==0){
                    System.out.print("You must pay " + u * 500);
                System.out.println("$ for the software licenses");
                }
                else{
                    System.out.print("You must pay " + u * 700);
                    System.out.println("$ for the software licenses");
                }
             }
            else{
                System.out.println("This license is not valid ");
            }
        }
    }
    }
import java.util.Scanner;

public class factorial {
    
    public static int fact(int n){
        
        if(n==0){
            return 1;
        }
        else return (n*fact(n-1));
    }
    public static boolean isStrongNumber (int x){
        int m, s=0;
        do{
            m=x%10;
            s+=fact(m);
            x/=10;
        }while (x>0);
        if (s==x){
            return true; 
              }
        else return false;
        }

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner (System.in)) {
            int i,fact=1;
            System.out.println("Enter a positive integer");
            int n = s.nextInt();
            fact = fact(n);
            System.out.println("The factorial is:" + fact);
            int p = s.nextInt();
            System.out.println("Strong between 1 and " + p );
            
            for (i=1;i<p;i++){
                if (isStrongNumber(i) == true){
                    System.out.println("i");
            }

            }
        }    
    }
}

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
    
        try (Scanner x = new Scanner (System.in)) {
            System.out.println("Enter a grade");
            
            int G = x.nextInt();
            int i = 0;
            int sum = G;
            int max = G;
            int min = G;
            
            
            for(i=1; G >= 0 && G <= 100; i++){
                
                System.out.println("Enter a grade");
                G = x.nextInt();
                
                if (G < 0){
                i--;
                }
                
                if (G > 0){
                sum += G;
                }
                
                if (G > max){
                max = G;
            }
                if (min > G && G > 0){
                    min = G;
                }
            }
            
            System.out.print("you entered " + i);
            System.out.println(" grades");
            
            System.out.println("The max grade is :" + max);
            
            System.out.println("the min grade is :" + min);
            
            double average = sum / i;
            System.out.println("The average is:" + average);
        }
       
    }

}
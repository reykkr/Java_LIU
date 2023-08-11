import java.util.Scanner;

public class employee {

    public static void main(String[] args) {
     
        try (Scanner s = new Scanner (System.in)) {
            System.out.println("Enter the name of the employee");
            String name = s.next();
            
            System.out.println("Enter the salary of the employee in $");
            double salary = s.nextDouble();
            
            if (salary < 400){
                System.out.println("The salary cannot be less than 400$");
            }
            
            if (salary < 1000 && salary > 400){
                double raise;
                raise = 0.025;
                
                double newsalary;
                newsalary = salary * (1 + raise);
                
                System.out.print(name);
                System.out.print("'s new salary after a raise of 2.5%");
                System.out.print(" is ");
                System.out.print("$");
                System.out.print(newsalary);
            }
            if (salary < 2000 && salary > 1000){
                double raise;
                raise = 0.032;
                
                double newsalary;
                newsalary = salary * (1 + raise);
                
                System.out.print(name);
                System.out.print("'s new salary after a raise of 3.2%");
                System.out.print(" is ");
                System.out.print("$");
                System.out.print(newsalary);
                        
                        
            } 
            if (salary > 2000){
                
                double raise = s.nextDouble();
                raise = 0.039;
                        
                 double newsalary;
                newsalary = salary * (1 + raise);
                
                System.out.print(name);
                System.out.print("'s new salary after a raise of 3.9%");
                System.out.print(" is ");
                System.out.print("$");
                System.out.print(newsalary);
            }
        }
    }
}
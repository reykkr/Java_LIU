import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            Employee[] E = new Employee[10];
            
            for (int i = 0; i < E.length; i++) {
                System.out.print("Enter employee name: ");
                String Ename = s.next();
                
                System.out.print("Enter Department name and code: ");
                String name = s.next();
                String code = s.next();
                
                Department D = new Department(name, code);
                E[i] = new Employee(Ename, "", D);
            }
            
            for (int i = 0; i < E.length; i++) {
                if (E[i].getDepartment().getCode().equals("C100")) {
                }
            }
            
            E[5].raiseSalary(250);
            
            E[0].setDepartment(new Department("HR", "H100"));
            
            for (int i = 0; i < E.length; i++) {
                System.out.println(E[i].toString());
            }
        }
    }
}
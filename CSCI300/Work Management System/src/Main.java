import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Department accounting = new Department("Accounting");

            for (int i = 0; i < 2; i++) {
                System.out.print("Enter staff name: ");
                String staffName = scanner.nextLine();
                System.out.print("Enter age: ");
                int staffAge = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number of working hours: ");
                int nbWorkinghr = Integer.parseInt(scanner.nextLine());
                
                Staff staff = new Staff(staffName, staffAge, nbWorkinghr);
                accounting.addStaff(staff);
            }

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter worker name: ");
                String workerName = scanner.nextLine();
                System.out.print("Enter age: ");
                int workerAge = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number of pieces: ");
                int nbrPieces = Integer.parseInt(scanner.nextLine());
                
                Worker worker = new Worker(workerName, workerAge, nbrPieces);
                accounting.addWorker(worker);
            }

            System.out.println("Salaries of all staffs:");
            for (Employee e : accounting.getEmployees()) {
                if (e instanceof Staff) {
                    System.out.println(e.getName() + "'s Salary: $" + ((Staff) e).computeSalary());
                }
            }

            System.out.println("Department Description:\n" + accounting.toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

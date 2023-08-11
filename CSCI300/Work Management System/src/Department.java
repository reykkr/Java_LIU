import java.util.ArrayList;

public class Department {

    private String title;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addStaff(Staff s) {
        employees.add(s);
    }

    public void addWorker(Worker w) {
        employees.add(w);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public int countStaff() {
        int count = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof Staff) {
                count++;
            }
        }
        return count;
    }

    public int countWorker() {
        int count = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof Worker) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(title + ".\nEmployees:\n");
        for (Employee e : employees) {
            result.append("- ").append(e.toString()).append("\n");
        }
        return result.toString();
    }
}
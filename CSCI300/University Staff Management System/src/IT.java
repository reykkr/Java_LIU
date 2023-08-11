import java.util.Date;

public class IT extends Employee {
    private double salary;

    public IT(double salary) {
        super("Mohamad Ali Ghaddar", new Date(2001, 11, 05));;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", IT Salary: " + salary;
    }
}

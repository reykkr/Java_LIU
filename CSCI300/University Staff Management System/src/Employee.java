import java.util.Date;

public class Employee {
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " (DOB: " + dob + ")";
    }
}
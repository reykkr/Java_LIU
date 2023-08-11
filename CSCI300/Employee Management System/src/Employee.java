public class Employee {
    private String name;
    private String address;
    private double salary;
    private Department department;

    public Employee(String name, String address, Department department){
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public String getCity(){
        String[] Address = address.split("\\.");
        return Address[0];
    }

    public String getPhone(){
        String[] Address = address.split("\\.");
        return Address[1];
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void raiseSalary(double amount){
        salary = salary + amount;
    }

    @Override
    public String toString() {
        return name + ", from " + this.getCity() + ", works at department " + department.getName() + " and gets a salary of " + salary;
    }
}

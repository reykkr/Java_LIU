public class FullTimeTeacher extends Teacher {
    private double baseSalary;
    private int hourLoad;

    public FullTimeTeacher(double baseSalary, int hourLoad, String major, double rate) {
        super(major);
        this.baseSalary = baseSalary;
        this.hourLoad = hourLoad;
    }

    public double computeSalary() {
        double extraHours = 40 - hourLoad; // Assuming a full-time load is 40 hours
        return baseSalary + rate * extraHours;
    }

    @Override
    public String toString() {
        return "Full Timer (" + getMajor() + "): Base Salary = " + baseSalary +
               ", Hour Load = " + hourLoad + ", Salary = " + computeSalary();
    }
}

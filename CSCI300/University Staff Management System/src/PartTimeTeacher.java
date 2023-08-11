public class PartTimeTeacher extends Teacher {
    private int proctoringHours;

    public PartTimeTeacher(int proctoringHours, String major, double rate) {
        super(major);
        this.proctoringHours = proctoringHours;
    }

    public double computeSalary() {
        return rate * (40 + 0.5 * proctoringHours); 
    }

    @Override
    public String toString() {
        return "Part Time (" + getMajor() + "): Proctoring Hours = " + proctoringHours +
               ", Salary = " + computeSalary();
    }
}

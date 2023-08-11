import java.util.Date;


public class Teacher extends Employee {
    public double rate;
    private String major;

    public Teacher(String major) {
        super("Alia Ghaddar", new Date(1985, 5, 15)); 
        this.major = major;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double computeSalary() {
        return 40 * rate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Rate: " + rate;
    }
}

public class Staff extends Employee {

    private int nbWorkinghr;

    public Staff(String name, int age, int nbWorkinghr) {
        super(name, age);
        this.nbWorkinghr = nbWorkinghr;
    }

    public int getNbWorkinghr() {
        return nbWorkinghr;
    }

    public void setNbWorkinghr(int nbWorkinghr) {
        this.nbWorkinghr = nbWorkinghr;
    }

    public double computeSalary() {
        return nbWorkinghr * 28.5 * (1 - 0.09);
    }
}
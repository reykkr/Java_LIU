public class Worker extends Employee {

    private int nbrPieces;

    public Worker(String name, int age, int nbrPieces) {
        super(name, age);
        this.nbrPieces = nbrPieces;
    }

    public int getNbrPieces() {
        return nbrPieces;
    }

    public void setNbrPieces(int nbrPieces) {
        this.nbrPieces = nbrPieces;
    }

    public double computeSalary() {
        return nbrPieces * 18 * (1 - 0.09);
    }
}

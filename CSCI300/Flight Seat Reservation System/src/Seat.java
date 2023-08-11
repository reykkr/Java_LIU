abstract class Seat implements Comparable<Seat> {
    private double price;

    public Seat(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public abstract String toString();

    public boolean buy(double money) {
        return money >= price;
    }

    @Override
    public int compareTo(Seat otherSeat) {
        return Double.compare(this.price, otherSeat.price);
    }

    public double getPrice() {
        return 10;
    }
}
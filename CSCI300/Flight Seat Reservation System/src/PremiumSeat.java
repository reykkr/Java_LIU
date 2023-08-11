class PremiumSeat extends Seat {
    private char pl;
    private double fee;

    public PremiumSeat(double price, char pl, double fee) {
        super(price);
        this.pl = pl;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "premium seat, " + pl + ", " + (getPrice() + fee) + "$";
    }

    @Override
    public boolean buy(double money) {
        return money >= getPrice() + fee;
    }
}
class NormalSeat extends Seat {
    private int num;

    public NormalSeat(double price, int num) {
        super(price);
        this.num = num;
    }

    @Override
    public String toString() {
        return "normal seat, " + num + ", " + getPrice() + "$";
    }
}
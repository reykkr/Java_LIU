class Flight {
    private String source;
    private String destination;
    private static final int NBSEATS = 10;
    private Seat[] sts = new Seat[NBSEATS];

    public Flight(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Flight: " + source + " to " + destination + "\nSeats: [");
        for (int i = 0; i < NBSEATS; i++) {
            if (sts[i] != null) {
                result.append(sts[i]).append("; ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public boolean buySeat(Seat s, int sn, double money) {
        if (sn >= 0 && sn < NBSEATS && sts[sn] == null && s.buy(money)) {
            sts[sn] = s;
            return true;
        }
        return false;
    }

    public double total() {
        double totalPaid = 0;
        for (Seat s : sts) {
            if (s != null) {
                totalPaid += s.getPrice();
            }
        }
        return totalPaid;
    }
}

public class Flight extends Trip implements Economical {
    private String seatClass;

    public Flight(String departureCity, String arrivalCity, double basicPrice, String seatClass) {
        super(departureCity, arrivalCity, basicPrice);
        if (!seatClass.equals("First Class") && !seatClass.equals("Economic")) {
            this.seatClass = "Invalid Class";
        } else {
            this.seatClass = seatClass;
        }
    }

    @Override
    public double calculateCost() {
        if (seatClass.equals("First Class")) {
            return getBasicPrice() * 2.5;
        } else {
            return getBasicPrice();
        }
    }

    @Override
    public void economize() {
        this.seatClass = "Economic";
    }

    @Override
    public String toString() {
        return "A flight departing from " + getDepartureCity() + ", going to " +
                getArrivalCity() + " for a basic price of " + getBasicPrice() + "$.\n" +
                "The seat class reserved for this flight is " + seatClass + ".";
    }
}

public abstract class Trip {
    private String departureCity;
    private String arrivalCity;
    private double basicPrice;

    public Trip(String departureCity, String arrivalCity, double basicPrice) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        if (basicPrice < 0) {
            this.basicPrice = 50;
        } else {
            this.basicPrice = basicPrice;
        }
    }

    public abstract double calculateCost();
    
    public String getDepartureCity() {
        return departureCity;
    }
    
    public String getArrivalCity() {
        return arrivalCity;
    }
    
    public double getBasicPrice() {
        return basicPrice;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", basicPrice=" + basicPrice +
                '}';
    }
}

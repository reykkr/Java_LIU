public class BusTrip extends Trip{
  public BusTrip(String dc, String ac, double bp){
    super(dc, ac, bp);
  }
    
  @Override
    public double calculateCost() {
        return getBasicPrice();
    }

    @Override
    public String toString() {
        return "A bus trip departing from " + getDepartureCity() + ", going to " +
                getArrivalCity() + " for a basic price of " + getBasicPrice() + "$.";
    }
}

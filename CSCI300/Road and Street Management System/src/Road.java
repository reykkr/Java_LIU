public class Road {
  private int speedLimit, length;
  private boolean carpool;

  public Road(int speedLimit, int length, boolean carpool) {
    this.speedLimit = speedLimit;
    this.length = length;
    this.carpool = carpool;
 }

 public String toString() {
   return "Road length " + length + ", speed limit is " + speedLimit +
         " and carpool lane is " + (carpool ? "available." : "not available.");
 }
}


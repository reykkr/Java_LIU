public class Agency {
    public static void main(String[] args) {
        Flight F = new Flight("Beirut", "Paris");

        F.buySeat(new NormalSeat(500, 23), 0, 600);

        System.out.println(F);

        System.out.println(F.buySeat(new NormalSeat(500, 23), 0, 600));
    }
}
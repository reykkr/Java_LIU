public class TicketApp {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        Flight flight = new Flight("Prague", "Vienna", 150, "First Class");
        BusTrip busTrip = new BusTrip("Vienna", "Venice", 92);

        ticket.addTrip(flight);
        ticket.addTrip(busTrip);

        System.out.println("Original Ticket:\n" + ticket);
        System.out.println("Total Cost before Reduction: $" + totalTicketCost(ticket));

        ticket.reduceCost();
        System.out.println("\nTicket after Reduction:\n" + ticket);
        System.out.println("Total Cost after Reduction: $" + totalTicketCost(ticket));
        System.out.println("Number of Bus Trips in the Ticket: " + countBusTrips(ticket));
    }

    public static double totalTicketCost(Ticket ticket) {
        double total = 0;
        for (int i = 0; i < ticket.tripNumber; i++) {
            total += ticket.trips[i].calculateCost();
        }
        return total;
    }

    public static int countBusTrips(Ticket ticket) {
        int count = 0;
        for (int i = 0; i < ticket.tripNumber; i++) {
            if (ticket.trips[i] instanceof BusTrip) {
                count++;
            }
        }
        return count;
    }
}
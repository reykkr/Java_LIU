public class Ticket {
    private String ticketNumber;
    private static int ticketsCounter = 0;
    Trip[] trips;
    int tripNumber;

    public Ticket(int maxNbTrip) {
        ticketsCounter++;
        ticketNumber = "TN" + ticketsCounter;
        trips = new Trip[maxNbTrip];
        tripNumber = 0;
    }

    public void addTrip(Trip t) {
        if (tripNumber < trips.length) {
            trips[tripNumber++] = t;
        }
    }

    public void reduceCost() {
        for (int i = 0; i < tripNumber; i++) {
            if (trips[i] instanceof Economical) {
                Economical economicalTrip = (Economical) trips[i];
                economicalTrip.economize();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("The ticket " + ticketNumber + " has the following trips:\n");
        for (int i = 0; i < tripNumber; i++) {
            result.append(i + 1).append(". ").append(trips[i].toString()).append("\n");
        }
        return result.toString();
    }
}

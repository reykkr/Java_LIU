public class Event {
    private String description;
    private String organizer;
    private double budget;
    private int numGuests;
    private String date;
    private static final int MAX_NUM_GUESTS = 200;

    public Event(String desc, String org, double bud, int nGuests, String d) {
        description = desc;
        organizer = org;
        budget = bud;
        numGuests = (nGuests > MAX_NUM_GUESTS) ? MAX_NUM_GUESTS : nGuests;
        date = d;
    }

    public String getOrganizerCode() {
        String[] words = organizer.split(" ");
        StringBuilder code = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                code.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return code.toString();
    }

    public String assessBudget() {
        if (budget > 5000) {
            return "Costly";
        } else if (budget < 2000) {
            return "Low Cost";
        } else {
            return "Average";
        }
    }

    public void setNumGuests(int nGuests) {
        numGuests = (nGuests > MAX_NUM_GUESTS) ? MAX_NUM_GUESTS : nGuests;
    }

    @Override
    public String toString() {
        return "Event: " + description + "\nOrganizer: " + organizer + "\nBudget: $" + budget +
               "\nNumber of Guests: " + numGuests + "\nDate: " + date;
    }
}

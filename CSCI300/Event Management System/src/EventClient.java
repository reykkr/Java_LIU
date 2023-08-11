import java.util.Scanner;

public class EventClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Event[] events = new Event[10];
        events[0] = new Event("Wedding", "Happy Times Co", 8000, 150, "10/08/2023");
        events[1] = new Event("Graduation Party", "Mega Events", 1500, 80, "15/06/2023");
        events[2] = new Event("Conference", "Tech Summit", 4500, 220, "20/09/2023");

        System.out.print("Enter the name of an organizer: ");
        String targetOrganizer = scanner.nextLine().trim();

        System.out.println("\nEvents organized by " + targetOrganizer + ":");
        for (Event event : events) {
            if (event != null && event.getOrganizerCode().equalsIgnoreCase(targetOrganizer)) {
                System.out.println(event);
                System.out.println("Budget Assessment: " + event.assessBudget() + "\n");
            }
        }

        int costlyEventCount = 0;
        for (Event event : events) {
            if (event != null && event.assessBudget().equals("Costly")) {
                costlyEventCount++;
            }
        }
        System.out.println("Number of Costly Events: " + costlyEventCount);

        System.out.println("\nAll Events:");
        for (Event event : events) {
            if (event != null) {
                System.out.println(event);
                System.out.println("Budget Assessment: " + event.assessBudget() + "\n");
            }
        }

        scanner.close();
    }
}
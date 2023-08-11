import java.util.Scanner;

public class Visit {

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            double visitors;
            double time;
            double pages;
            double sec;
            double timespent;
            double pagesviewed;
            
            do {
                System.out.println("Enter the number of visitors: ");
                visitors = s.nextInt();
                
                if (visitors == 0) {
                    System.out.println("END OF PROGRAM");
                } else {
                    System.out.println("Enter the time: ");
                    time = s.nextInt();
                    
                    System.out.println("Enter the number of pages: ");
                    pages = s.nextInt();
                    
                    sec = time * 60;
                    
                    timespent = sec / visitors;
                    System.out.println("Average time spent: " + timespent);
                    
                    pagesviewed = pages / visitors;
                    System.out.println("Average pages viewed: " + pagesviewed);
                }
            } while (visitors > 0);
        }
    }
}
import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        
        try (Scanner s = new Scanner (System.in)) {
            int month;
            char calendar = '0';
            char ch = 'n';
            char CH = 'N';
            
            do{
                System.out.println("Enter the month number");
                month = s.nextInt();
                
                if (month == 1){
                    System.out.println("January");
                }
                if (month == 2){
                    System.out.println("February");
                }
                if (month == 3){
                    System.out.println("March");
                }
                if (month == 4){
                    System.out.println("April");
                }
                if (month == 5){
                    System.out.println("May");
                }
                if (month == 6){
                    System.out.println("June");
                }
                if (month == 7){
                    System.out.println("July");
                }
                if (month == 8){
                    System.out.println("August");
                }
                if (month == 9){
                    System.out.println("September");
                }
                if (month == 10){
                    System.out.println("October");
                }
                if (month == 11){
                    System.out.println("November");
                }
                if (month == 12){
                    System.out.println("December");
                }
                System.out.println("Do you want to continue? (press n to stop) ");
                calendar = s.next().charAt(0);
                
            } while (calendar < CH || calendar > ch);
        }
    }
}

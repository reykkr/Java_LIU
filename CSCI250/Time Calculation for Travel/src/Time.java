import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name of departure City:");
        String dep = s.next();

        System.out.println("Enter the name of the destination City:");
        String des = s.next();

        System.out.println("Enter the distance in km:");
        double d = s.nextDouble();

        System.out.println("Enter the speed of your car in km/hr:");
        double speed = s.nextDouble();

        double T;
        T = d / speed;

        double m;
        m = T * 60;

        System.out.print("The time needed from " + dep);
        System.out.print(" to reach " + des);
        System.out.print(" is: " + T);
        System.out.print(" hours or " + m);
        System.out.println(" minutes");

        s.close();
    }
}
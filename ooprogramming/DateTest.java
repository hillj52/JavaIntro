package examples.ooprogramming;
import java.util.Date;
public class DateTest {
    public static void main(String args[]) {
        Date now = new Date();
        System.out.println(now.toString());
        System.out.println(now);

        System.out.print("Day of the Week: ");
        System.out.println(now.getDay());

        System.out.print("Day of the Month: ");
        System.out.println(now.getDate());

        System.out.print("Month: ");
        System.out.println(now.getMonth());

        System.out.print("Year: ");
        System.out.println(now.getYear());

        System.out.print("Time: ");
        System.out.println(now.getTime());
    }
}
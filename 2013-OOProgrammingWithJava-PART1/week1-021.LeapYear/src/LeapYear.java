
import java.util.Scanner;

public class LeapYear {
    
    public static String isLeapYear(int year) {
        if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            return "The year is a leap year.";
        else
            return "The year is not a leap year.";
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        System.out.println(isLeapYear(year));
    }
}

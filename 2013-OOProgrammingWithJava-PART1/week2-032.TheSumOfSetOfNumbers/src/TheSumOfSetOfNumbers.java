
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int until = Integer.parseInt(reader.nextLine());
        int total = 0;
        
        for(int i = 1; i <= until; i++) {
           total += i;
        }
        
        System.out.println("Sum is: " + total);

    }
}

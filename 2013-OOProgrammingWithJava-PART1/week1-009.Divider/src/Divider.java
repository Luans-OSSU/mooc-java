
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        double n1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        double n2 = Integer.parseInt(reader.nextLine());
        
        double result = n1 / n2;
        
        System.out.println("Division: " + n1 + " / " + n2 + " = " + result);
    }
}

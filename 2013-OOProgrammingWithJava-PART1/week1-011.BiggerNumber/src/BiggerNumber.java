
import java.util.Scanner;

public class BiggerNumber {
    
    
    public static int biggerNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        
        int result = biggerNumber(n1, n2);
        
        System.out.println("The bigger number of the two numbers given was: " + result);
    }
    
}

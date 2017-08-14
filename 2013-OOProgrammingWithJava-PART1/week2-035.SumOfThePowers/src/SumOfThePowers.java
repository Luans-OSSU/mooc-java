
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double n = Integer.parseInt(reader.nextLine());
        
        int total = 1;
        
        for (int i = 1; i <= n;i++ )
            total += (int)Math.pow(2, i);
        
        System.out.println("The result is " + total);
    }
}

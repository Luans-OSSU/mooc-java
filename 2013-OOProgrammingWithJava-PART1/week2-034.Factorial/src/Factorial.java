import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = Integer.parseInt(reader.nextLine());
        int total = 1;
        
        for (int i = 1; i <= n; i++)
            total *= i;
        
        System.out.println("Factorial is " + total);

    }
}


import java.util.Scanner;

public class AgeCheck {
    
    
    public static String checkAge(int a) {
        if(a < 0 || a > 120)
            return "Impossible!";
        else
            return "OK";
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.println(checkAge(age));

    }
}

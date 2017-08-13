
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true) {
            
            double n = Double.parseDouble(reader.nextLine());
            
            if(n > -30 && n < 40) {
               Graph.addNumber(n); 
            }
        }
    }
}
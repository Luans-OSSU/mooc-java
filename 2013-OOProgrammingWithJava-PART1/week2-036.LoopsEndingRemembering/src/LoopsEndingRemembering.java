import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        double average = 0;
        boolean shut = false;
        
        System.out.print("Type numbers: ");
        
        while(true) {
            
            int n = Integer.parseInt(reader.nextLine());
            
            if(n == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum += n;
                count++;
                if(n % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }  
            
        }
        
        if(sum > 0)
            System.out.println("The sum is " + sum);
        
        if(count > 0)
            System.out.println("How many numbers: " + count);
        
        average = (double)sum / count;
        
        if(count >0 && sum > 0)
            System.out.println("Average: " + average);
        
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
    
}

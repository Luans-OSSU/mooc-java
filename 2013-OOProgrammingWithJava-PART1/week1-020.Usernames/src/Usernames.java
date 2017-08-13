
import java.util.Scanner;

public class Usernames {
    
    public static String login(String user, String pass) {
        if( (user.equals("alex") || user.equals("emily")) && (pass.equals("mightyducks") || pass.equals("cat")) )
            return "You are now logged into the system!";
        else
            return "Your username or password was invalid!";
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your username: ");
        String user = reader.nextLine();
        
        System.out.print("Type your password: ");
        String pass = reader.nextLine();
        
        System.out.println(login(user, pass));
    }
}

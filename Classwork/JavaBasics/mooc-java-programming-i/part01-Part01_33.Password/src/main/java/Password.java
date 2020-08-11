
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input 
        System.out.println("Password");
        String pass = scan.nextLine(); 
        
        //Test input with if / else and return 
        
        if (pass.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        }   else {
            System.out.println("Off with you!");
        }
        
        
    }
}

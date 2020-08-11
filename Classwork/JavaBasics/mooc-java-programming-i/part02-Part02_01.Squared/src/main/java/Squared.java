
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Identify input value and declare variables
        int num;
        
        
        // User input assigned to variables 
        num = Integer.valueOf(scanner.next());
        
        //Identifying operation and declaring variable
        int square = num * num;
        
        
        // Print calculation results
        System.out.println(square);
       
    }
}

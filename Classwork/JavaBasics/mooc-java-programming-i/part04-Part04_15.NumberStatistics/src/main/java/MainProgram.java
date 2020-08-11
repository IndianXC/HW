
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics evenStats = new Statistics(); 
        Statistics oddStats = new Statistics(); 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input %2 ==0 ) {
                evenStats.addNumber(input); 
            }
            if (input %2 ==1 ) {
                oddStats.addNumber(input); 
            }
            
            statistics.addNumber(input);
        }
        
        
        
        System.out.println("Sum: " + statistics.sum() );
        System.out.println("Sum of even numbers: " + evenStats.sum() );
        System.out.println("Sum of odd numbers: " + oddStats.sum() );
        
   
    }
}

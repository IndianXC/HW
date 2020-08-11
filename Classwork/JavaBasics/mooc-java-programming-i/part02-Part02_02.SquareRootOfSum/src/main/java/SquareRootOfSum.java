
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //ID variables
        int num1;
        int num2;
        int sum; 
        
        //Take 2 user inputs 
        num1 = Integer.valueOf(scanner.next());
        num2 = Integer.valueOf(scanner.next());

        //Add together
        sum = num1 + num2; 
        
        //Square root of sum
        double squareRoot = Math.sqrt(sum);
        
        //Print results
        System.out.println(squareRoot);
    }
}

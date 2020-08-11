
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Get First 
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        
        //Get Second
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        
        
             
             
        double result = (double) (a+b)/2;
        System.out.println("The average is " + result );
        
        ;
    }
}

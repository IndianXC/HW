
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        // Write your program here
          System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        
        //Get Second
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        
        //Addition
        System.out.println(a + " + " + b + " = " +(a+b)); 
        
        //Subtract
        System.out.println(a + " - " + b + " = " +(a-b));
        
        //Multiply
        System.out.println(a + " * " + b + " = " +(a*b));
        
        //Divide
        double result = (double) a/b;
        System.out.println(a + " / " + b + " = " + result);
    }
}

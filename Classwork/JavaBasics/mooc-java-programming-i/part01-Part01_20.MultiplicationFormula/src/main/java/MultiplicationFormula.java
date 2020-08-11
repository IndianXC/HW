
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //Second
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
       
       
        //Multiply 
       System.out.println(first + " * " + second + " = " + (first*second));
    }
}

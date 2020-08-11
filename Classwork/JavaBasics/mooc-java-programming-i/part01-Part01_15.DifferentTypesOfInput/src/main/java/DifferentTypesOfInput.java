
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
            // Create scanner object
       Scanner input = new Scanner(System.in);
       
       //Output the prompt
       System.out.println("Give a string: ");
      
       String line = input.nextLine();
       
       //Integer
        System.out.println("Give an integer:");
        int value = input.nextInt();
        
        //Double
        System.out.println("Give a double:");
        
        double dub = input.nextDouble();
        
 
        // Bool
        System.out.println("Give a boolean:");
      
        boolean bool = input.nextBoolean();

       //Tell them what they entered. 
        System.out.println("You gave the string " + line);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + dub);
        System.out.println("You gave the boolean " + bool);
        
    }
}

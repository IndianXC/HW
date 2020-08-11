
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Scanner reader = new Scanner(System.in);
        int age = 0;
        int count = 0;
        int highestAge = 0; 

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
             break;
         }
            
         String[] parts = input.split(",");
         age = Integer.valueOf(parts[1]) ; 
         count = count + 1;
         
         if (age > highestAge) {
             highestAge = age; 
         }
          
        }
       if (count>0)  {
           System.out.println("Age of the oldest: " + highestAge);
       }
}
}

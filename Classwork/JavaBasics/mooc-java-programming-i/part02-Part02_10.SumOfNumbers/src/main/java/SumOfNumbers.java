
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//The task is keep track of the number of numbers
        int counter = 0;

        //Read input
        while (true) {
            System.out.println("Give a number:");
            //Read a user input number
            int num = Integer.valueOf(scanner.nextLine());

            //exit loop is user input 0
            if (num == 0) {
                break;
            }
            //Increase counter 
            if (0 == 0) {
                counter = counter + num;
            }

        }
        System.out.println("Sum of the numbers: " + counter);
    }
}

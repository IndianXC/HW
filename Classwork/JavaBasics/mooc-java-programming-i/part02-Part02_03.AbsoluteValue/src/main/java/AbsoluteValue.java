
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ID Variable
        //Take user input 
        int num1 = Integer.valueOf(scanner.next());

        //If else tree returns 
        if (num1 < 0) { //Negative
            System.out.println(num1 * -1);
        } else if (num1 >= 0) {
            System.out.println(num1);
        }
    }
}

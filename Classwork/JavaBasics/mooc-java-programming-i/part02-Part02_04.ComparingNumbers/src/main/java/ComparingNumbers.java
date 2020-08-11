
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Two variables input on seperate lines
        int num1 = Integer.valueOf(scanner.next());
        int num2 = Integer.valueOf(scanner.next());

        //Else if tree determining which is larger
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}

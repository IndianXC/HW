
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //take 1
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scan.nextLine());

        //take 2
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scan.nextLine());

        //test imput
        if (num1 == num2) {
            System.out.println("The numbers are equal");
        } else if (num1 > num2) {
            System.out.println("Greater number is " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number is " + num2);
        }

    }
}

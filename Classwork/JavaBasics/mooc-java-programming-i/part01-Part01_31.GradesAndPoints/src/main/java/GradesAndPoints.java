
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //take 1
        System.out.println("Give points [0-100]:");
        int num1 = Integer.valueOf(scan.nextLine());

        //take 2
        //test imput
        if (num1 < 0) {
            System.out.println("Grade: impossible!");
        } else if (num1 < 50) {
            System.out.println("Grade: failed");
        } else if (num1 <= 59) {
            System.out.println("Grade: 1");
        } else if (num1 <= 69) {
            System.out.println("Grade: 2");
        } else if (num1 <= 79) {
            System.out.println("Grade: 3");
        } else if (num1 <= 89) {
            System.out.println("Grade: 4");
        } else if (num1 <= 100) {
            System.out.println("Grade: 5");
        } else if (num1 > 100) {
            System.out.println("Grade: incredible!");
      
        }

    }
}


import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year 
        System.out.println("Give number:");
        int year = Integer.valueOf(scanner.nextLine());

        //Check
        if (year == 1984) {
            System.out.println("Orwell");
        }
    }
}

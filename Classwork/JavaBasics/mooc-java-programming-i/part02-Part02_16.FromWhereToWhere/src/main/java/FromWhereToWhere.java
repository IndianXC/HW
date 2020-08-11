
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int numHigh = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int numLow = Integer.valueOf(scanner.nextLine());

        while (numLow <= numHigh) {
            System.out.println(numLow);
            numLow = numLow + 1;
        }
    }
}

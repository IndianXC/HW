
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfTimes = Integer.valueOf(scanner.nextLine());
        printUntilNumber(numOfTimes);
    }

    public static void printUntilNumber(int numOfTimes) {
        // Write some code in here
        int i = 0;
        int stayer = numOfTimes;

        while (i < stayer) {
            System.out.println(i+1);
            numOfTimes = numOfTimes - 1;
            i = i + 1;
        }

    }
}

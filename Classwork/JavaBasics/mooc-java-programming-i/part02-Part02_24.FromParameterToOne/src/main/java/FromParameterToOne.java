
import java.util.Scanner;



public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfTimes = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(numOfTimes);
    }

    public static void printFromNumberToOne(int numOfTimes) {
        // Write some code in here
        int i = 0;
        int stayer = numOfTimes;

        while (i < stayer) {
            System.out.println(numOfTimes);
            numOfTimes = numOfTimes - 1;
            i = i + 1;
        }

    }
}

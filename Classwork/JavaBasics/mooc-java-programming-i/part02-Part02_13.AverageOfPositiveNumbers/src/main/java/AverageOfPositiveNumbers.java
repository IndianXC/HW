
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            double n = Double.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            }
            if (n > 0) {
                sum = sum + n;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average.");
        } else {
            System.out.println(sum / count);

        }
    }
}

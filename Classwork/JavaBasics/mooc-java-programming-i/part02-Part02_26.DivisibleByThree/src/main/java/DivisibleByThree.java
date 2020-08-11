
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3, 9);
    }

    public static void divisibleByThreeInRange(int first, int end) {
        int i = first;

        while (i <= end) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}


import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Request input loop
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.next());
            if (num == 4) {
                break;
            }
        }
    }
}


import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine()); 
        int start = 0;
        int end = input;
        
        for (int i = start; i - 1 <end; i++) {
            System.out.println(i);
        }
        
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
             System.out.print("From where?");
            int start = Integer.valueOf(scanner.nextLine());
            
             System.out.print("To where?");
            int end   = Integer.valueOf(scanner.nextLine()); 

        
        
        for (int i = start; i <= end ; i++) {
            int number = numbers.get(i);
            System.out.println(number);
            // alternatively: System.out.println(numbers.get(i));
    }
}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = scanner.nextInt();
            scanner.nextLine(); 
            
            programs.add(new TelevisionProgram (name, duration) ); 
            
        }
            System.out.println("Maximum duration: ");
            int maxDuration = scanner.nextInt(); 
            
        for (TelevisionProgram info : programs) {
            if (info.duration  <= maxDuration)
            System.out.println(info.name + " , " + info.duration + " minutes");
        }
        

    }
}


import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();

            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            if (age==1) {
                System.out.println(name + ", age: " + age + " year");
            }
            
            if (age>1 || age==0) {
                System.out.println(name + ", age: " + age + " years");
            }
            
        }   
                
        
        }  catch (Exception ex) {

            System.out.println("Reading the file " + file + " failed.");

        }
}   
}

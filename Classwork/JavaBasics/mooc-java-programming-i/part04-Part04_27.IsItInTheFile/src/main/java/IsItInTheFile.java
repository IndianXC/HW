
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();

        // implement reading the file here.

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                list.add(fileReader.nextLine());

            }

        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Search for:");
        //String searchedFor = scanner.nextLine();
        
        while (true) {
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
            break; 
        }
    }
}

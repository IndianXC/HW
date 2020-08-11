import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
                ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
 
        while (true) {

            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));

        }
        
        while(true) {
            System.out.println("What information will be printed? ");
            String input = scanner.nextLine();
            
            if (input.equals("everything"))
                for (Book info : books) {
                    System.out.println(info.title + ", " + info.pages + " pages, " + info.pubYear);
                     
                }
            
            if (input.equals("name"))
                for (Book info : books) {
                    System.out.println(info.title);
                     
                }
            break; 
        }
    }
}

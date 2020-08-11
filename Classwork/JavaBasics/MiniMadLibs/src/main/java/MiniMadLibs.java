/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author India
 */
import java.util.Scanner; 

public class MiniMadLibs {
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in); 
        
        String noun1; 
        String adjective1; 
        String noun2; 
        int number;
        String adjective2; 
        String pluralNoun1, pluralNoun2, pluralNoun3; 
        String verbPresentTense; 
        String verbPastTense; 
        
        
        System.out.println("Give me a...Noun");
        noun1 = scan.nextLine(); 
        
        System.out.println("Adjective");
        adjective1 = scan.nextLine(); 
        
        System.out.println("Noun");
        noun2 = scan.nextLine(); 
        
        System.out.println("Number");
        number = scan.nextInt();
        scan.nextLine(); 
        
        System.out.println("Adjective");
        adjective2 = scan.nextLine(); 
        
        System.out.println("3 Plural Nouns, hit enter after each");
        pluralNoun1 = scan.nextLine(); 
        pluralNoun2 = scan.nextLine(); 
        pluralNoun3 = scan.nextLine(); 
        
        System.out.println("Verb in the present tense");
        verbPresentTense = scan.nextLine();
        
        System.out.println("Past tense verb");
        verbPastTense = scan.nextLine();
        
        //ideal way to do these page breaks? 
        
        System.out.println(noun1 + ":the " + adjective1 + " frontier. These are the voyages of the starship");
        System.out.println(noun2 + ". Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 + " ");
        System.out.println("to seek out " + adjective2 + " " +pluralNoun2 + " and " + adjective2 + " " + pluralNoun3);
        System.out.println(" , to boldly " + verbPresentTense + " where no one has " + verbPastTense + " before.");
        
        
        
        
    }
    
}

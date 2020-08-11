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

public class PassingTheTuringTest {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //What's really happening here?
        
        String name; 
        String favoriteColor; 
        String favoriteFruit; 
        int favoriteNumber; 
        int result; 
        
    
        System.out.println("Hello there!");
        System.out.println("What's your name?");
        name = scan.nextLine(); //why use next line vs next? 
                                //what's happening with the parts divided with a "."? 
        
        System.out.println("Hi, " + name + "!" + "What's your favorite color?");
        favoriteColor = scan.nextLine(); 
        
        System.out.println(favoriteColor + " eh? Mine is dark green.");
        
        System.out.println("Speaking of green things, I like corn. That's my favorite fruit");
        System.out.println("What's your favorite fruit?");
        favoriteFruit = scan.nextLine(); 
        
        System.out.println(favoriteFruit + " are delicious!");
        System.out.println("Btw, what's your favorite number?");
        favoriteNumber = scan.nextInt();
        result = favoriteNumber * 999; 
        
        System.out.println(favoriteNumber + " is a really cool number");
        System.out.println("Did you know that " + favoriteNumber + " X 999 is " + result);
        
        System.out.println("Welp, good talking to you " + name);
        
        //how to get spaces in output like example?
        //all of my output is smooshed together
        
    }
    
    
    
}

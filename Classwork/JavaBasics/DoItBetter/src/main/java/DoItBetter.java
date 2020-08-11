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

public class DoItBetter {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int miles; 
        double dogs; 
        int langs; 
        
        System.out.println("How many miles can you run?");
        miles = scan.nextInt(); 
        System.out.println("Psh, I can run " + ( miles*2 + 1) );
        
        System.out.println("How many dogs can you eat?");
        dogs = scan.nextDouble(); 
        System.out.println("Pathetic, I can eat "+ (dogs*2 +1) );
        
        System.out.println("How many languages do you know?");
        langs = scan.nextInt(); 
        System.out.println("Lame, I'm far more worldly. I speak " + (langs*2 + 1));
        
        
        
    }
    
}

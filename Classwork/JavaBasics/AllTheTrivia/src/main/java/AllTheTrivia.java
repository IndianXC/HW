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

public class AllTheTrivia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numBaseballPlayers; 
        String biggestBird;
        String bidenCar; 
        
        System.out.println("How many baseball players on defense?");
        numBaseballPlayers = scan.nextInt(); 
        scan.nextLine(); 
        
        System.out.println("What's the biggest bird?");
        biggestBird = scan.nextLine();
        
        System.out.println("What car does Joe Biden drive?");
        bidenCar = scan.nextLine(); 
        
        System.out.println("No way! Joe Biden drives " + numBaseballPlayers + " " + biggestBird + "s around town!");
        
        System.out.println("It's also known that " + biggestBird + "s are huge fans of the " + bidenCar);

        
        
        
    }
    
    
}

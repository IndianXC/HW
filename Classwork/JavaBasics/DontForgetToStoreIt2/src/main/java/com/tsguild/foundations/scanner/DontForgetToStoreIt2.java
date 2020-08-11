/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author India
 */
package com.tsguild.foundations.scanner; 

import java.util.Scanner; 

public class DontForgetToStoreIt2 {
    
    public static void main(String [] args) {
        
        int meaningOfLife = 42; 
        double pi = 3.14159; 
        String cheese, color; 
        
        Scanner inputReader = new Scanner (System.in); 
        
        System.out.println("Give me at least 5 decs: " );
        pi = inputReader.nextDouble();
        
        System.out.println("Meaning of life? ");
        meaningOfLife = inputReader.nextInt(); 
        
        System.out.println("Cheese?");
        cheese = inputReader.next(); 
        
        System.out.println("Color?");
        color = inputReader.next(); 
        
        
         System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
      System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
    }
}

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

public class QuestForTheUserInput {
    
    public static void main (String [] args){
        Scanner inputReader = new Scanner(System.in);
        
        String yourName; 
        String yourQuest; 
        int velocityOfSwallow; 
        
        System.out.println("What is your name? ");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine(); 
        
        System.out.println("Velociy unladen swallow?");
        
        velocityOfSwallow = inputReader.nextInt(); 
        
        System.out.println("How do you know" + velocityOfSwallow + "is correct " + yourName);
        
        System.out.println("African or European");
        
        System.out.println("Maybe skip and go " + yourQuest);
        
    }
        
        
}

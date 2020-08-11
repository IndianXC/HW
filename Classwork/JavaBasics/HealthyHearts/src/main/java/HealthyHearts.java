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

public class HealthyHearts {
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in); 
        
        //was using double appropriate? used int initially, lossy conversion? 
        double age;
        double max; 
        double targetMin;
        double targetMax; 
        
        System.out.println("What's your age?");
        age = scan.nextInt(); 
        
        max = 220 - age;
        targetMin = max*.5;  
        targetMax = max*.85; 
        
        System.out.println("Your max HR should be" + max + " beats per minute");
        System.out.println("Your target HR is " + targetMin + "-" + targetMax + " beats per min");
        
        
    }
}

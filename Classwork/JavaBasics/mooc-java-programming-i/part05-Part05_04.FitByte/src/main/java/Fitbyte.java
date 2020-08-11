/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author India
 */
public class Fitbyte {
    
    private int age; 
    private int restingHeartRate; 
    public double maxHr; 
    
     public Fitbyte(int age, int restingHeartRate) {
         this.age = age; 
         this.restingHeartRate = restingHeartRate;
         
     }
     
     public double targetHeartRate (double percentageofMaximum) {
         return ((maxHr - this.restingHeartRate) * percentageofMaximum )+ this.restingHeartRate; 
         
     }
     
     public double maxHr (int age) {
         return 206.3 - (0.711 * this.age) ; 
     }
     
    
}

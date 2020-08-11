/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author India
 */
public class Timer {
 
    private ClockHand hundredths;
    private ClockHand seconds;
   
 
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
 
    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 00) {
            this.seconds.advance();
            
        }
    }
   
    public String toString(){
        return this.seconds + ":" + this.hundredths;
    }
}
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

public class BestAdderEver {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        int num1, num2, num3, numSum;
        
        num1 = 1; 
        num2 = 2; 
        num3 = 3; 
        
        System.out.println("Give me three numbers!");
        
        
        num1 = scan.nextInt();
        num2 = scan.nextInt(); 
        num3 = scan.nextInt(); 
        
        numSum = num1 + num2 + num3; 
        
        System.out.println(numSum);
        
        System.out.println(numSum);
        
        
    }
    
}

import java.util.ArrayList;

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfLetter = 0;
        String longestName = new String();
        double average =0;
        int sum = 0;
        int count =0 ;
        
        while(true){
            String input = scanner.nextLine();
            String[] s = input.split(",");
            if(input.equals("")){
                break;
            }
            int lengthOfTheWord = s[0].length();
            if( numberOfLetter < lengthOfTheWord){
               numberOfLetter = lengthOfTheWord;
            }
            if(s[0].length() == numberOfLetter){
                longestName = s[0];
                }
            sum = sum + Integer.valueOf(s[1]);
            count = count + 1;
            if(count > 0){
                average = (1.0*sum/count);
           
            }
        }    
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
        
    }
}

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner for input
        Scanner input = new Scanner(System.in);
        
        // scan in a word
        String word = input.nextLine();
        // make sure the input is lower case
        word = word.toLowerCase();
        
        // make some changes
        String changedWord = word.replace("a", "4");
        
        // find the first L position
        int lPosition = changedWord.indexOf("l");
        
        // found an l in the word
        if(lPosition != -1){
            // breaking the String apart
            // starts at the beginning, goes UPTO the L
            String beginning = changedWord.substring(0, lPosition);
            // start at the L, take everything after it
            String ending = changedWord.substring(lPosition);
            // reassemble
            changedWord = ending + beginning + "ay";
        }
        
        // check if the word typed out is "hello"
        if(word.equals("hello")){
            System.out.println("Hi there!"); 
        }
        
        // gets the length of the word
        int length = word.length();
        // walk through the characters using a loop
        int count = 0;
        for(int i = 0; i < length; i++){
            // look at the character
            // is the character an l
            if(word.charAt(i) == 'l'){
                // count it!
                count = count + 1;
            }
        }
        
        
        System.out.println("The word is " + changedWord);
        System.out.println("The L is at position " + lPosition);
        System.out.println("There are " + count + " Ls");
    }
    
}


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
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user
        Scanner input = new Scanner(System.in);
        
        // ask the user for their name
        System.out.println("Please enter your name");
        // get the name from the user
        String name = input.nextLine();
        // say hello
        System.out.println("Hello " + name);
        
        // Ask for the year the user was born
        System.out.println("Please enter your birth year");
        int birthYear = input.nextInt();
        // calculate age
        int age = 2016 - birthYear;
        // tell the user their age
        System.out.println("You are " + age + " years old!");
        
        if(age > 30){
            System.out.println("You are old");
        }else if(age > 10 && age < 30){
            
        }
    }
    
}

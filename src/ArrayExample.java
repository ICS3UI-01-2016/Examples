
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
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a Scanner for input
        Scanner input = new Scanner(System.in);
        
        // create an integer array with known values
        int[] myNums = {5, 2, -3, 10, 7};
        
        // print the array
        System.out.println("Array: " + myNums);
        // go through each spot in the array
        for(int i = 0; i < 5; i++){
            System.out.println(myNums[i]);
        }
        
        // multiply 2 spots together into a variable
        int product = myNums[0] * myNums[1];
        // sets spot 2 equal the product
        myNums[2] = product;
        
        
        // create an array to store 5 marks
        double[] marks = new double[5];
        // get the user to fill the array
        //marks[0] = input.nextDouble();
        //marks[1] = input.nextDouble();
        for(int i = 0; i < marks.length; i++){
            System.out.println("Please enter in mark " + (i+1));
            marks[i] = input.nextDouble();
        }
        
        // print the array
        System.out.println("You entered in these marks:");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        
        //double total = marks[0] + marks[1] + ..
        // add all the numbers using a loop
        // start a total at 0
        double total = 0;
        // go through each number
        for(int i = 0; i < marks.length; i++){
           // add the number into total
           total = total + marks[i];
        }
        
        System.out.println("Total: " + total);
        // calculate the average
        double avg = total/marks.length;
        System.out.println("Average: " + avg);
        
        
        //EXTRA!!!!
        // These are 2D arrays. Same as a 1D array 
        // They store a value at a row and column (grid spot)
        char[][] grid = new char[3][3];
        grid[0][0] = 'x';
        grid[1][1] = 'o';
        grid[0][2] = 'x';
        
        
    }
    
}

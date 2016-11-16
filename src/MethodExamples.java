
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
public class MethodExamples {

    public static void sayHello() {
        System.out.println("Hello world");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static double
            calcRectArea(double length, double width) {
        double answer = length * width;
        return answer;
    }
            
    public static int add(int num1, int num2){
            int answer = num1 + num2;
            return answer;
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHello();
        sayHello("Bob");
        sayHello("Nancy");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = input.nextLine();
        sayHello(name1);

        System.out.println("Please input a length");
        double length = input.nextDouble();
        System.out.println("Please input a width");
        double width = input.nextDouble();
        
        double area = calcRectArea(length, width);
        System.out.println("Area is " + area);

        
        int answer = 0;
        answer = add(5,78);
        System.out.println(answer);
        
    }

}

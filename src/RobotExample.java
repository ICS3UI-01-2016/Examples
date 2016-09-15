
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City kw = new City();
        // create a robot
        Robot karel = new Robot(kw,3,4,Direction.EAST);
        Robot jeff = new Robot(kw,1,2,Direction.SOUTH);
        
        // create walls
        new Wall(kw,3,4,Direction.SOUTH);
        new Thing(kw,3,5);
        
        // get karel to move
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        
        // get jeff to move
        jeff.setLabel("J");
        jeff.setColor(Color.BLUE);
        // create a variable to stop the movement
        int moves = 0;
        // loop 4 times
        while(moves < 4){
            jeff.move();
            jeff.turnLeft();
            // add 1 to the movement counter
            moves = moves + 1;
        }
       
        
    }
    
    
}

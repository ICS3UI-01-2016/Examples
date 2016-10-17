
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class WhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        new Wall(kw,1,5,Direction.EAST);
        new Thing(kw,1,3);
        
        // while loop with no condition
        while(karel.frontIsClear()){
            // move the robot
            karel.move();
            // check for something to pick up
            if(karel.canPickThing()){
                // pick it up
                karel.pickThing();
            }
        }
        // end of the loop
        // turn the robot around
        karel.turnLeft();
        karel.turnLeft();
        
        // go home karel!
        while(karel.frontIsClear()){
            // if on avenue 1
            if(karel.getAvenue() == 1 && karel.getStreet() == 1){
                // stop the loop
                break;
            }else if(!karel.frontIsClear()){
                
            }else{
                karel.move();
            }
        }
        
        
        
    }
    
}

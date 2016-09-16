
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class ThreadedRobots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the city
        City kw = new City();
        // create the robots
        // they need to have the keyword 'final' infront for this to work
        final Robot karel = new Robot(kw, 1, 1, Direction.SOUTH);
        final Robot jeff = new Robot(kw, 1, 2, Direction.SOUTH);

        // A thread that determines karel's movements
        Thread karelThread = new Thread(new Runnable() {
            
            // what karel should be doing
            @Override
            public void run() {
                karel.move();
                karel.move();
                karel.turnLeft();
                karel.move();
            }
        });
        
        // A thread that determines Jeff's movements
        Thread jeffThread = new Thread(new Runnable() {
            
            // what Jeff should be doing
            @Override
            public void run() {
                jeff.move();
                jeff.move();
                jeff.turnLeft();
                jeff.move();
            }
        });

        // tell both threads to start running
        karelThread.start();
        jeffThread.start();
    }

}

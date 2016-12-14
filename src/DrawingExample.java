
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author lamon
 */


public class DrawingExample extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    
    Color hunterGreen = new Color(4, 92, 5);
    
    int pacmanX = 100;
    int mouthAngle = 0;
    boolean mouthClosing = true;
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH,HEIGHT);
        g.setColor(hunterGreen);
        g.fillRect(250, 100, 150, 50);
        g.setColor(Color.RED);
        g.fillOval(500, 500, 100,100);
        
        int[] xpoints = {450, 700, 750};
        int[] ypoints = {500, 350, 450};
        g.fillPolygon(xpoints, ypoints, 3);
        
        g.setColor(Color.YELLOW);
        g.fillArc(pacmanX, 300, 100, 100, 45 - mouthAngle, 270 + 2*mouthAngle);
        // GAME DRAWING ENDS HERE
    }
    
    
    // The main game loop
    // In here is where all the logic for my game will go
    public void run()
    {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;
        
        // the main game loop section
        // game will end if you set done = false;
        boolean done = false; 
        while(!done)
        {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            
            pacmanX = pacmanX + 1;
            if(mouthClosing){
                mouthAngle++;
            }else{
                mouthAngle--;
            }
            
            if(mouthAngle == 45){
                mouthClosing = false;
            }
            if(mouthAngle == 0){
                mouthClosing = true;
            }
            // GAME LOGIC ENDS HERE 
            
            // update the drawing (calls paintComponent)
            repaint();
            
            
            
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try
            {
               if(deltaTime > desiredTime)
               {
                   //took too much time, don't wait
                   Thread.sleep(1);
               }else{
                  // sleep to make up the extra time
                 Thread.sleep(desiredTime - deltaTime);
               }
            }catch(Exception e){};
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");
       
        // creates an instance of my game
        DrawingExample game = new DrawingExample();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        // adds the game to the window
        frame.add(game);
         
        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // starts my game loop
        game.run();
    }
}
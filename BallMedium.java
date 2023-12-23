import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
public class BallMedium extends Actor
{
    // data properties/attributes
    
    //required for ball movement:
    public int velX = 4;
    public int velY = 4;
    public int deltaT = 2;
     
    //required to count the score + determine winner:
    private int player1Count;
    private int player2Count;
        
    private Scoreboard score;

    // Create ball as a white 38x38 circle. 
    
    public BallMedium(Scoreboard scoreboard)
    {
        GreenfootImage img = new GreenfootImage(40,40);
        img.drawOval(0,0,38,38);
        img.setColor(Color.ORANGE);
        img.fillOval(0,0,38,38);
        setImage(img);
            
        score = scoreboard;

    }
        
    /**
         * Act - do whatever the Ball wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {
        //Ball movement:
        setLocation(getX()+(velX*deltaT), getY()+(velY*deltaT));
            
        wallCollision();
        paddleCollision();
            
        //Score:
        scorePoints();
         
    } 
        
    //Movement of the ball after collision with the top/bottom wall.
    public void wallCollision() 
    {
        //If the ball is closer than 10 pixels to the upper or lower wall, it bounces off (negative velocity).
        
        if (getY() <10 || getY() > 390)
        {
            velY = -velY;
            Greenfoot.playSound("pukul.mp3");
        }
    }
    
    //Movement of the ball after collision with a paddle.
    public void paddleCollision()
    {
        //If the ball hits a paddle, it bounces off (negative velocity).
        if(getOneIntersectingObject(Paddle.class) != null)
        {
            Greenfoot.playSound("pukul.mp3");
            velX = -velX;
        }
    }
    
    //Method to update the score/determine the winner.
    public void scorePoints()
    {
        // If the ball reaches the left wall, player 2 gets a point.
        if (getX() < 10)
        {
            player2Count++;
                
            if(player2Count == 5) //player 2 wins if they have 5 points
            {
            World restartWorld = getWorld();
            restartWorld = new restartWorld();
            Greenfoot.setWorld(restartWorld);
        
            bgl1 bgl1 = (bgl1) getWorld();
            bgl1.stopSound();
        
            Greenfoot.playSound("win.mp3");
            }
            else
            {
                updateScoreboard();
            }
        }
        //If the ball reaches the right wall, player 1 gets a point.
        if(getX() > 590)
        {
            player1Count++;
               
            if(player1Count == 5) //player 1 wins if they have 5 points
            {
            World restartWorld = getWorld();//Method to change to restartWorld for the winner.
            restartWorld = new restartWorld();
            Greenfoot.setWorld(restartWorld);
        
            bgl1 bgl1 = (bgl1) getWorld();
            bgl1.stopSound();
        
            Greenfoot.playSound("win.mp3");
            }
            else
            {
                updateScoreboard();
            }
        }
    }
    
    //Method to display a message with the winner.
    
    //Method to update the scoreboard with the new score.
    public void updateScoreboard() {
       Greenfoot.playSound("ping.wav");
       setLocation(300,200);
       score.setText("Player 1: "+ player1Count, "Player 2: "+ player2Count);  //update score
       Greenfoot.delay(25); //put game on hold 
    }
}

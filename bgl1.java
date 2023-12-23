import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bgl1 extends World
{
    GreenfootSound Sound = new GreenfootSound("backsound2.mp3");
    /**
     * Constructor for objects of class PongWorld.
     * 
     */
    public bgl1()
    {    
        super(600, 400, 1);
        // Add scoreboard to the top.
        Scoreboard scoreboard = new Scoreboard("Player 1", "Player 2");
        addObject(scoreboard,300,20);

        //Add players and ball.
        addObject(new Player1(),10,200);
        addObject(new Player2(),590,200);
        addObject(new BallMedium(scoreboard),300, 200);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void started(){
        sound();
    }
    
    public void sound()
    {        
        if(!Sound.isPlaying()){
        Sound.playLoop();
        Sound.setVolume(100);
        }
    }
    
    public void stopSound(){
        Sound.stop();
    }
}

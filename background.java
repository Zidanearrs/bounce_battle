import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class background extends World
{
    GreenfootSound Sound = new GreenfootSound("backsound.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Greenfoot.playSound("backsound.mp3");
        Start start = new Start();
        addObject(start,294,328);
        start.setLocation(294,328);
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

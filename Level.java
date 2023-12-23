import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level extends World
{
    GreenfootSound Sound = new GreenfootSound("backsound2.mp3");
    /**
     * Constructor for objects of class result.
     * 
     */
    public Level()
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

        Easy easy = new Easy();
        addObject(easy,295,58);
        Medium medium = new Medium();
        addObject(medium,289,210);
        Hard hard = new Hard();
        addObject(hard,287,333);
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

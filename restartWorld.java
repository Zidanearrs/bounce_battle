import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class restartWorld extends World
{

    /**
     * Constructor for objects of class restartWorld.
     * 
     */
    public restartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        restart restart = new restart();
        addObject(restart,298,255);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Paddle
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("w")) // move up with w key
        {
            setLocation(getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("s")) // move down with s key
        {
            setLocation(getX(), getY()+5);
        }
    }    
}
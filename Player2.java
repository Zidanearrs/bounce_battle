import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player2 extends Paddle
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")) // move up with up arrow key
        {
            setLocation(getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("down")) // move down with down arrow key
        {
            setLocation(getX(), getY()+5);
        }
    }    
}


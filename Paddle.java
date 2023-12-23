import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle extends Actor
{
    //Create paddle as a 10x100 cyan rectangle.
    
    public Paddle()
    {
        GreenfootImage img = new GreenfootImage(10,100);
        img.setColor(Color.WHITE);
        img.fillRect(0,0,10,100);
        setImage(img);
    }
}

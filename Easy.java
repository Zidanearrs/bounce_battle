import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Easy extends Actor
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
        World PongWorld = getWorld();
        PongWorld = new PongWorld();
        PongWorld.started();
        Greenfoot.setWorld(PongWorld);
    
        Level Level= (Level)getWorld();
        Level.stopSound();
        }
        
        GreenfootImage img = this.getImage();
        img.scale(150,70);
        this.setImage(img);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        World w = getWorld();
        if(Greenfoot.mouseClicked(this)){
        World Level = getWorld();
        Level = new Level();
        Greenfoot.setWorld(Level);
        Level.started();
        
        background background= (background)getWorld();
        background.stopSound();
        }
        
        GreenfootImage img = this.getImage();
        img.scale(200,82);
        this.setImage(img);
    }

}
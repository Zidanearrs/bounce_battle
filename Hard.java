import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hard extends Actor
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
        World bgl2 = getWorld();
        bgl2 = new bgl2();
        bgl2.started();
        Greenfoot.setWorld(bgl2);
    
        Level Level= (Level)getWorld();
        Level.stopSound();
        }
        GreenfootImage img = this.getImage();
        img.scale(150,70);
        this.setImage(img);
    }
}

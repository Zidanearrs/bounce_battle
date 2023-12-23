import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Medium extends Actor
{
    /**
     * Act - do whatever the Medium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
        World bgl1 = getWorld();
        bgl1 = new bgl1();
        bgl1.started();
        Greenfoot.setWorld(bgl1);
    
        Level Level= (Level)getWorld();
        Level.stopSound();
        }
        GreenfootImage img = this.getImage();
        img.scale(150,70);
        this.setImage(img);
    }
}

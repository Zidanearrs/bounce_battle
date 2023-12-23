import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class restart extends Actor
{
    /**
     * Act - do whatever the restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World w = getWorld();
        if(Greenfoot.mouseClicked(this)){
        World Start = getWorld();
        Start = new background();
        Start.started();
        Greenfoot.setWorld(Start);
        }
        GreenfootImage img = this.getImage();
        img.scale(200,65);
        this.setImage(img);
    }
}

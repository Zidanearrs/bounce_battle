import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    //Create scoreboard at the top + format (font)
    
    public Scoreboard(String player1, String player2)
    {
        GreenfootImage img = new GreenfootImage(600,40);
        img.setColor(Color.WHITE);
        Font font = new Font("Times New Roman", 20);
        img.setFont(font);
        img.drawString(player1,100,35);
        img.drawString(player2,450,35);
        setImage(img);
    }
    
    //Change the text on the scoreboard.
    
    public void setText(String player1, String player2)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(player1,100,35);
        img.drawString(player2,450,35);
    }
}

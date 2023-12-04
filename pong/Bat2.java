import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bat2 extends Actor
{
    private int speed = 7;
    private Control bridge = new PlayerTwoBridge();
    
    public void act() 
    {
        checkKey();
    }    
    
    
    public void moveUp()
    {
        setLocation( getX() , getY() - speed);
    }
    
    public void moveDown()
    {
        setLocation( getX() , getY() + speed);
    }
    
    public void checkKey()
    {
        if (Greenfoot.isKeyDown(bridge.moveUp()) )
        {
            moveUp();
        }
        if (Greenfoot.isKeyDown(bridge.moveDown()) )
        {
            moveDown();
        }
    }
}
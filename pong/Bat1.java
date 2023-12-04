    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bat1 extends Actor
{
    private Control bridge = new PlayerOneBridge();
    private int speed = 7;
    public String controlUp;
    public String controlDown;
    
    public void act() 
    {
        checkKey();// puxa o método de controle
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
            moveUp(); // método de definição de posição
        }
        if (Greenfoot.isKeyDown(bridge.moveDown()))
        {
            moveDown(); // método de definição de posição
        }
    }
}

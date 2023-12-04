import greenfoot.*;
public class Ball extends Actor
{
    private int bounceY = 0;
    private int bounceX = 3;
    private int speedX = 3;
    private int speedY = 3;
    GifImage myGif = new GifImage("cat.gif");
    Context context = new Context();
    public void act() 
    {
        setImage(myGif.getCurrentImage());
            
        checkWall1();
        checkWall2();
        checkHit1();
        checkHit2();
        checkWin1();
        checkWin2();
        move();
    }
    public boolean hitWin2()
    {
        Actor theBall = getOneObjectAtOffset (0, 0, Win2.class);
        return theBall != null;
    }
    
    public boolean hitWin1()
    {
        Actor theBall = getOneObjectAtOffset (0, 0, Win1.class);
        return theBall != null;
    }
    
    public boolean hitWall1()
    {
        Actor theBall = getOneObjectAtOffset (0, 0, Wall1.class);
        return theBall != null;
    }
    
    public boolean hitWall2()
    {
        Actor theBall = getOneObjectAtOffset(0, 0, Wall2.class);
        return theBall != null;
    }
    
    public boolean hitBat1()
    {
        Actor theBall = getOneObjectAtOffset(0, 0, Bat1.class);
        return theBall != null;
    }
    
    public boolean hitBat2()
    {
        Actor theBall = getOneObjectAtOffset(0, 0, Bat2.class);
        return theBall != null;
    }
    
    public void move()
    {
        setLocation (getX() + speedX,getY() + speedY);// define o ponto de início da bola
    }
    
    
    public void checkWin1()
    {
        if (hitWin1())
        {
            setImage("p2w.png");
            setLocation (300,200);
            context.setStrategy(new ConcreteStrategyOne());
            context.executeStrategy();
        {
            Greenfoot.stop();
        }
    }
    }
    
    
    public void checkWin2()
    {
        if (hitWin2())
        {
            setImage("p1w.png");
            setLocation (300,200);
            context.setStrategy(new ConcreteStrategyTwo());
            context.executeStrategy();
        {
            Greenfoot.stop();
        }
        }
    }
    
    public void checkWall1()
    {
        if (hitWall1())
        {
            speedY = speedY - speedY - speedY;
        }
    }
        
            public void checkWall2()
    {
        if (hitWall2())
        {
            speedY = speedY - speedY - speedY;
 
        }
    }
    
    public void checkHit2()
    {
        if(hitBat2())
        {
            speedX = speedX + 0;
            speedX = speedX - speedX - speedX;
            Greenfoot.playSound("switch.wav");
        }
    }
    
    public void checkHit1()
        {
        if(hitBat1())
        {
            speedX = speedX + 1;
            speedX = speedX - speedX - speedX;
            Greenfoot.playSound("switch.wav");
        }
    }
    
    public void changeDirection()
    {
        speedX = speedX - speedX; // aumenta a velocidade da bola
    }
}

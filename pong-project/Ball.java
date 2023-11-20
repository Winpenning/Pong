import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ball extends Actor
{
    private int deltaX;
    private int deltaY;
    public Ball(){
        deltaX = 3;
        deltaY = 3;
    }
    public void act()
    {
        setLocation(getX()+deltaX,getY()+deltaY);
        if(getY()<10 || getY()>390){
            deltaY = deltaY * -1;
        }
        if(getX()<1 || getX()>590){
            deltaX = deltaX * -1;
            
        }
            }
}

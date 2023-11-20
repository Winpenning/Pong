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
         verificarColisao();
         
        setLocation(getX()+deltaX,getY()+deltaY);
        if(getY()<10 || getY()>390){
            deltaY = deltaY * -1;
        }
        if(getX()<1 || getX()>590){
            deltaX = deltaX * -1;
            
        }
    }
    private void verificarColisao() {
        Paddle paddle = (Paddle) getOneIntersectingObject(Paddle.class);
        Paddle2 paddle2 = (Paddle2) getOneIntersectingObject(Paddle2.class);

        if (paddle != null || paddle2 != null) {
            deltaX = -deltaX;
        }
    }
}

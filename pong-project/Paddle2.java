import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle2 extends Actor
{
   private int velocidade = 5;

    public void act() {
        mover();
    }

    private void mover() {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - velocidade);
        }

        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + velocidade);
        }
    }
}

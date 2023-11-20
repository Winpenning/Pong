import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
         private int velocidade = 5;

    public void act() {
        mover();
    }

    private void mover() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - velocidade);
        }

        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + velocidade);
        }
    }
    }



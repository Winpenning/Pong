import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
<<<<<<< HEAD
        addObject(new Ball(), getWidth() / 2, getHeight() / 2);
        addObject(new Paddle(), 50, getHeight() / 2);
        addObject(new Paddle2(), getWidth() - 50, getHeight() / 2);

=======

        addObject(new Ball(), getWidth() / 2, getHeight() / 2);
        addObject(new Paddle(), 50, getHeight() / 2);
        addObject(new Paddle2(), getWidth() - 50, getHeight() / 2); 
>>>>>>> 984eb0aae3896f21a0cc5a7340a57e5cd08c97b8
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class background extends World
{
    public WorldBuild world;
    public background()
    {    
        super(600, 400, 1); 
        world = new WorldBuild();
        populatedWorld();
    } 
    public void populatedWorld()
    {
       addObject( world.setBall(), 300 , 200);
       addObject( world.setWall1(), 0 , 0);
       addObject( world.setWall2(), 0 , 0);
       addObject( world.setWin1(), 0 , 0);
       addObject( world.setWin2(), 0 , 0);
       addObject( world.setBat2(), 20 , 200);
       addObject( world.setBat1(), 580 , 200);
    }
    
}

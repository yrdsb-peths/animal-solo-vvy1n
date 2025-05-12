import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pumpkin extends Actor
{
    /**
     * Act - do whatever the Pumpkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}

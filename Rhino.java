import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rhino extends Actor
{
    /**
     * Act - do whatever the Rhino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        //Remove pumpkin if rhino eats it
        eat();
    }
    /**
     * eat pumpkin and spawn new one
     */
    public void eat()
    {
        
        if(isTouching(Pumpkin.class))
        {
            removeTouching(Pumpkin.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPumpkin();
            world.increaseScore();
        }
    }
}

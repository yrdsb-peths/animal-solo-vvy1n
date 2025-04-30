import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Rhino rhino = new Rhino();
        addObject(rhino, 300, 200);
        
        createPumpkin();
    }
    
    public void createPumpkin()
    {
        Pumpkin pumpkin = new Pumpkin();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pumpkin, x, y);
    }
}

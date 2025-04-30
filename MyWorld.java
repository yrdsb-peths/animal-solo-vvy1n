import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Rhino rhino = new Rhino();
        addObject(rhino, 300, 200);
        
        Pumpkin pumpkin = new Pumpkin();
        addObject(pumpkin, 300, 0);
    }
}

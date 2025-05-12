import greenfoot.*;

public class MyWorld extends World
 {  
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        
        //create rhino object
        Rhino rhino = new Rhino();
        addObject(rhino, 300, 300);
        
        //create label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createPumpkin();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createPumpkin()
    {
        Pumpkin pumpkin = new Pumpkin();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pumpkin, x, y);
    }
}

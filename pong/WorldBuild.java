public class WorldBuild implements IBuilder 
{
     
    public Bat1 bat1;
    public Bat2 bat2;
    public Wall1 wall1;
    public Wall2 wall2;
    public Win1 win1;
    public Win2 win2;
    public Ball ball;
    public void populate(){
        setBat1();
        setBat2();
        setWall1();
        setWall2();
        setWin1();
        setWin2();
        setBall();
    }
    public Bat1 setBat1(){
        bat1 = new Bat1();
        return bat1;
    }
    public Bat2 setBat2(){
        bat2 = new Bat2();
        return bat2;
    }
    public Wall1 setWall1(){
        wall1 = new Wall1();
        return wall1;
    }
    public Wall2 setWall2(){
        wall2 = new Wall2();
        return wall2;
    }
    public Win1 setWin1(){
        win1 = new Win1();
        return win1;
    }
    public Win2 setWin2(){
        win2 = new Win2();
        return win2;
    }
    public Ball setBall(){
        ball = new Ball();
        return ball;
    }
}

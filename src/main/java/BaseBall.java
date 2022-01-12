import processing.core.PApplet;

public class BaseBall extends MainBaseBall{
    private int width = 0;
    private int height;
    private int speed;
    private final int DIAMETER = 15;

    public BaseBall(int height, int speed) {
        this.height = height;
        this.speed = speed;
    }

    public void drawCircle(){
        ellipse(width, height, DIAMETER, DIAMETER);
        width += speed;
    }
}

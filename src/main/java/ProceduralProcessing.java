import processing.core.PApplet;

public class ProceduralProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int x1 = 0;
    private int x2 = 0;
    private int x3 = 0;
    private int x4 = 0;
    private final int speedBall1 = 1;
    private final int speedBall2 = 2;
    private final int speedBall3 = 3;
    private final int speedBall4 = 4;

    public static void main(String[] args) {
        PApplet.main("ProceduralProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(x1,height/5);
        drawCircle(x2,(height * 2)/5);
        drawCircle(x3,(height * 3)/5);
        drawCircle(x4,(height * 4)/5);
        x1 += speedBall1;
        x2 += speedBall2;
        x3 += speedBall3;
        x4 += speedBall4;
    }

    private void drawCircle(int width, int height) {
        ellipse(width, height, DIAMETER, DIAMETER);
    }
}

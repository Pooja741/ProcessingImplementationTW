import processing.core.PApplet;

public class MainBaseBall extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int DIAMETER = 15;
    BaseBall baseBall1;
    BaseBall baseBall2;
    BaseBall baseBall3;
    BaseBall baseBall4;
    int x1 =0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;


    public static void main(String[] args) {
        PApplet.main("MainBaseBall", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        baseBall1 = new BaseBall(height/5, 1);
//        baseBall2 = new BaseBall((height * 2)/5, 2);
//        baseBall3 = new BaseBall((height * 3)/5, 3);
//        baseBall4 = new BaseBall((height * 4)/5, 4);

    }

    @Override
    public void draw() {
//        baseBall1.drawCircle();
//        baseBall2.drawCircle();
//        baseBall3.drawCircle();
//        baseBall4.drawCircle();
        ellipse(x1,height/5, DIAMETER, DIAMETER);
        x1 += 1;
        ellipse(x2, (height * 2)/5, DIAMETER, DIAMETER);
        x2 += 2;
        ellipse(x3, (height * 3)/5, DIAMETER, DIAMETER);
        x3 += 3;
        ellipse(x4, (height * 4)/5, DIAMETER, DIAMETER);
        x4 += 4;
    }
}

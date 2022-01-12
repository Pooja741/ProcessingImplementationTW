import OOP.Circle;
import processing.core.PApplet;

public class SketchBook extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    Circle circle1;
    Circle circle2;
    Circle circle3;
    Circle circl4;
    int x1 =0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;


    public static void main(String[] args) {
        PApplet.main("SketchBook", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        circle1 = new Circle(height/5, 1);
        circle2 = new Circle((height * 2)/5, 2);
        circle3 = new Circle((height * 3)/5, 3);
        circl4 = new Circle((height * 4)/5, 4);

    }

    @Override
    public void draw() {
        circle1.circle(this);
        circle2.circle(this);
        circle3.circle(this);
        circl4.circle(this);
    }
}

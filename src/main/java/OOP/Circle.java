package OOP;

import processing.core.PApplet;

public class Circle extends PApplet{
    private int width = 0;
    private int height;
    private int speed;
    private final int DIAMETER = 15;

    public Circle(int height, int speed) {
        this.height = height;
        this.speed = speed;
    }

    public void circle(PApplet pApplet){
        pApplet.ellipse(width, height, DIAMETER, DIAMETER);
        width += speed;
    }
}

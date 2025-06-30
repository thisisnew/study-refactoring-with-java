package ch11.after;

public class ShapeLine extends Shape {
    protected ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine" + this);
    }
}

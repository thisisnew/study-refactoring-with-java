package ch11.after;

public class ShapeOval extends Shape {
    protected ShapeOval(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        System.out.println("drawRectangle" + this);
    }
}

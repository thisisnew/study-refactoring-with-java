package ch08.after;

public class ShapeLine extends Shape {
    protected ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        drawLine();
    }

    private void drawLine() {
        System.out.println("drawLine:" + this.toString());
    }
}

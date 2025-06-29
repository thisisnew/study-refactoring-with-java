package ch08.after;

public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public static Shape createShape(int typeCode, int startx, int starty, int endx, int endy) {
        switch (typeCode) {
            case TYPECODE_LINE:
                return new ShapeLine(startx, starty, endx, endy);
            case TYPECODE_RECTANGLE:
                return new ShapeRectangle(startx, starty, endx, endy);
            case TYPECODE_OVAL:
                return new ShapeOval(startx, starty, endx, endy);
            default:
                throw new IllegalArgumentException("Unknown typeCode: " + typeCode);
        }
    }

    protected Shape(int startx,
                    int starty,
                    int endx,
                    int endy) {
        _startx = startx;
        _starty = starty;
        _endx = endx;
        _endy = endy;
    }

    public abstract int getTypeCode();
    public abstract String getName();
    public abstract void draw();

    @Override
    public String toString() {
        return "[" + getName() +
                "( _startx=" + _startx +
                ", _starty=" + _starty +
                ", _endx=" + _endx +
                ", _endy=" + _endy +
                ")]";
    }
}

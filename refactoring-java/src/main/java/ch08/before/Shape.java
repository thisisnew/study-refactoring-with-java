package ch08.before;

public class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _typeCode;
    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    protected Shape(int typeCode,
                    int startx,
                    int starty,
                    int endx,
                    int endy) {
        _typeCode = typeCode;
        _startx = startx;
        _starty = starty;
        _endx = endx;
        _endy = endy;
    }

    public int getTypeCode() {
        return _typeCode;
    }

    public String getName() {
        switch (_typeCode) {
            case TYPECODE_LINE:
                return "LINE";
            case TYPECODE_RECTANGLE:
                return "RECTANGLE";
            case TYPECODE_OVAL:
                return "OVAL";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "[" + getName() +
                "( _startx=" + _startx +
                ", _starty=" + _starty +
                ", _endx=" + _endx +
                ", _endy=" + _endy +
                ")]";
    }

    public void draw() {
        switch (_typeCode) {
            case TYPECODE_LINE:
                drawLine();
                break;
            case TYPECODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPECODE_OVAL:
                drawOval();
                break;
        }
    }

    private void drawLine() {
        System.out.println("drawLine:" + this.toString());
    }

    private void drawRectangle() {
        System.out.println("drawRectangle:" + this.toString());
    }

    private void drawOval() {
        System.out.println("drawOval:" + this.toString());
    }
}

package ch07.before;

public class Item {

    public static final int TYPECODE_BOOK = 0;
    public static final int TYPECODE_DVD = 1;
    public static final int TYPECODE_SOFTWARE = 0;

    private final int _typeCode;
    private final String _title;
    private final int _price;

    public Item(int typeCode, String title, int price) {
        _typeCode = typeCode;
        _title = title;
        _price = price;
    }

    public int getTypeCode() {
        return _typeCode;
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "Item[type=" + _typeCode + ",title=" + _title + ",price=" + _price + "]";
    }
}

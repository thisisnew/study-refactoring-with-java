package ch07.after;

public class ItemType {
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private final int _typeCode;

    private ItemType(int typeCode) {
        _typeCode = typeCode;
    }

    public int getTypeCode() {
        return _typeCode;
    }
}

package ch07.after;

public enum ItemType {
    BOOK(0),
    DVD(1),
    SOFTWARE(2);

    private final int _typeCode;

    private ItemType(int typeCode) {
        _typeCode = typeCode;
    }

    public int getTypeCode() {
        return _typeCode;
    }
}

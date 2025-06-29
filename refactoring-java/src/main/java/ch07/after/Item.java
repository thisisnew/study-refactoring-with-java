package ch07.after;

public class Item {
    private final ItemType _itemType;
    private final String _title;
    private final int _price;

    public Item(ItemType itemType,
                String title,
                int price) {
        _itemType = itemType;
        _title = title;
        _price = price;
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "Item[type=" + _itemType.getTypeCode() + ",title=" + _title + ",price=" + _price + "]";
    }
}

package ch06.before;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private String _authorName;
    private String _authorMail;

    public Book(String title,
                String isbn,
                String price,
                String authorName,
                String authorMail) {
        _title = title;
        _isbn = isbn;
        _price = price;
        _authorName = authorName;
        _authorMail = authorMail;
    }

    public String getTitle() {
        return _title;
    }

    public String getIsbn() {
        return _isbn;
    }

    public String getPrice() {
        return _price;
    }

    public String getAuthorName() {
        return _authorName;
    }

    public String getAuthorMail() {
        return _authorMail;
    }

    public void set_authorName(String authorName) {
        _authorName = authorName;
    }

    public void set_authorMail(String authorMail) {
        _authorMail = authorMail;
    }

    public String toXml() {
        String author = tag("author", tag("name", _authorName) + tag("mail", _authorMail));
        String book = tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
}
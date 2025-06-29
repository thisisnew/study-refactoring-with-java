package ch05.before;

public class Banner {
    private final String _content;
    public Banner(String content) {
        _content = content;
    }

    public void print(int times) {
        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }

        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

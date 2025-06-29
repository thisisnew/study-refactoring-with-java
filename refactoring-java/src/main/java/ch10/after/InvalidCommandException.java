package ch10.after;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {}
}

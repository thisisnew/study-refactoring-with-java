package ch01.secondrefactoring;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return "[ RobotCommand: name = " + _name + " ]";
    }
}

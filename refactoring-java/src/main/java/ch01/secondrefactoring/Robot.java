package ch01.secondrefactoring;

public class Robot {

    public static final RobotCommand WALK = new RobotCommand("walk");
    public static final RobotCommand STOP = new RobotCommand("stop");
    public static final RobotCommand JUMP = new RobotCommand("jump");

    private final String _name;

    public Robot(String name) {
        _name = name;
    }

    public void order(RobotCommand command) {
        if (command == WALK) {
            System.out.println(_name + " walks.");
        } else if (command == STOP) {
            System.out.println(_name + " stops.");
        } else if (command == JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }

}

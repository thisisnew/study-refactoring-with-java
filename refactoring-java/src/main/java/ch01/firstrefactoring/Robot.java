package ch01.firstrefactoring;

public class Robot {

    public static final int WALK = 0;
    public static final int STOP = 1;
    public static final int JUMP = 2;

    private final String _name;

    public Robot(String name) {
        _name = name;
    }

    public void order(int command) {
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

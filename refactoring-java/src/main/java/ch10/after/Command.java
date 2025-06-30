package ch10.after;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
    public static final Command FORWARD = new Command("forward") {
        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    };
    public static final Command BACKWARD = new Command("backward") {
        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    };
    public static final Command TURN_LEFT = new Command("left") {
        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    };
    public static final Command TURN_RIGHT = new Command("right") {
        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    };

    private static final Map<String, Command> _commandNameMap = new HashMap<>();
    static {
        _commandNameMap.put("forward", FORWARD);
        _commandNameMap.put("backward", BACKWARD);
        _commandNameMap.put("left", TURN_LEFT);
        _commandNameMap.put("right", TURN_RIGHT);
    }
    private final String _name;
    protected Command(String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    public static Command parseCommand(String name) throws InvalidCommandException {
        if (!_commandNameMap.containsKey(name)) {
            throw new InvalidCommandException(name);
        }

        return _commandNameMap.get(name);
    }

    public abstract void execute(Robot robot);

    private static class Forward extends Command {

        protected Forward() {
            super("forward");
        }

        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    }

    private static class Backward extends Command {

        protected Backward() {
            super("backward");
        }

        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    }

    private static class Right extends Command {

        protected Right() {
            super("right");
        }

        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    }

    private static class Left extends Command {

        protected Left() {
            super("left");
        }

        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    }

}

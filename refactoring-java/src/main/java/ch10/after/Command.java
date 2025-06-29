package ch10.after;

import java.util.HashMap;
import java.util.Map;

public class Command {
    public static final Command FORWARD = new Command("forward");
    public static final Command BACKWARD = new Command("backward");
    public static final Command TURN_LEFT = new Command("left");
    public static final Command TURN_RIGHT = new Command("right");

    private static final Map<String, Command> _commandNameMap = new HashMap<>();
    static {
        _commandNameMap.put("forward", FORWARD);
        _commandNameMap.put("backward", BACKWARD);
        _commandNameMap.put("left", TURN_LEFT);
        _commandNameMap.put("right", TURN_RIGHT);
    }
    private final String _name;
    public Command(String name) {
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
}

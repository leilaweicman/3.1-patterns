package nivel1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private final List<String> commands = new ArrayList<>();

    private Undo() {}

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void undoLastCommand() {
        if (hasCommands()) {
            commands.remove(commands.size() - 1);
        }
    }

    public List<String> getCommands() {
        return new ArrayList<>(commands);
    }

    public boolean hasCommands() {
        return !commands.isEmpty();
    }
}

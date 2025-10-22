package nivel1;

public class UndoController {
    private final Undo undo = Undo.getInstance();

    public String addCommand(String command) {
        if (command == null || command.trim().isEmpty()) {
            return "Command cannot be empty.";
        }
        undo.addCommand(command.trim());
        return "Command added: " + command;
    }

    public String undoLastCommand() {
        if (!hasCommands()) {
            return "No commands to undo.";
        }
        undo.undoLastCommand();
        return "Last command undone.";
    }

    public String getHistory() {
        if (!hasCommands()) {
            return "No commands saved.";
        }
        StringBuilder sb = new StringBuilder("\nCommand history:\n");
        int i = 1;
        for (String cmd : undo.getCommands()) {
            sb.append("  ").append(i++).append(". ").append(cmd).append("\n");
        }
        return sb.toString();
    }

    public boolean hasCommands() {
        return undo.hasCommands();
    }
}

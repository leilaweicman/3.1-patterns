package nivel1;

public class UndoMenu {
    private final UndoController controller = new UndoController();
    private final UndoView view = new UndoView();

    public void start() {
        view.printMessage("=== Undo Command System ===");
        boolean running = true;

        while (running) {
            view.printMenu();
            String option = view.readInput();

            switch (option) {
                case "1" -> {
                    String cmd = view.askCommand();
                    view.printMessage(controller.addCommand(cmd));
                }
                case "2" -> view.printMessage(controller.undoLastCommand());
                case "3" -> view.printMessage(controller.getHistory());
                case "4" -> {
                    running = false;
                    view.printMessage("Exiting program...");
                }
                default -> view.printMessage("Invalid option. Please try again.");
            }
        }
    }
}

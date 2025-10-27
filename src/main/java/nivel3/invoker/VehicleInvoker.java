package nivel3.invoker;

import nivel3.commands.Command;

public class VehicleInvoker {

    public void executeCommand(Command command) {
        command.execute();
    }
}

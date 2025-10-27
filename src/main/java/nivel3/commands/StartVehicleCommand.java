package nivel3.commands;

import nivel3.vehicles.Vehicle;

public class StartVehicleCommand implements Command {

    public final Vehicle vehicle;

    public StartVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}

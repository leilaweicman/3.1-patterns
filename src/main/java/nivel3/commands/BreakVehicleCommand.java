package nivel3.commands;

import nivel3.vehicles.Vehicle;

public class BreakVehicleCommand implements Command {

    public final Vehicle vehicle;

    public BreakVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}

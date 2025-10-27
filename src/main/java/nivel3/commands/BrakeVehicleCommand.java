package nivel3.commands;

import nivel3.vehicles.Vehicle;

public class BrakeVehicleCommand implements Command {

    public final Vehicle vehicle;

    public BrakeVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}

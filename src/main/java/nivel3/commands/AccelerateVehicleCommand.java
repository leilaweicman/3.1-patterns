package nivel3.commands;

import nivel3.vehicles.Vehicle;

public class AccelerateVehicleCommand implements Command {

    public final Vehicle vehicle;

    public AccelerateVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}

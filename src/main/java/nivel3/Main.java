package nivel3;

import nivel3.commands.*;
import nivel3.invoker.VehicleInvoker;
import nivel3.vehicles.*;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle airplane = new Airplane();
        Vehicle boat = new Boat();

        VehicleInvoker invoker = new VehicleInvoker();

        System.out.println("Car actions:");
        invoker.executeCommand(new StartVehicleCommand(car));
        invoker.executeCommand(new AccelerateVehicleCommand(car));
        invoker.executeCommand(new BrakeVehicleCommand(car));

        System.out.println("\nBike actions:");
        invoker.executeCommand(new StartVehicleCommand(bike));
        invoker.executeCommand(new AccelerateVehicleCommand(bike));
        invoker.executeCommand(new BrakeVehicleCommand(bike));

        System.out.println("\nAirplane actions:");
        invoker.executeCommand(new StartVehicleCommand(airplane));
        invoker.executeCommand(new AccelerateVehicleCommand(airplane));
        invoker.executeCommand(new BrakeVehicleCommand(airplane));

        System.out.println("\nBoat actions:");
        invoker.executeCommand(new StartVehicleCommand(boat));
        invoker.executeCommand(new AccelerateVehicleCommand(boat));
        invoker.executeCommand(new BrakeVehicleCommand(boat));
    }
}

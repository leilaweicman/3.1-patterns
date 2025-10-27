package nivel3.vehicles;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("The cyclist starts pedaling.");
    }

    @Override
    public void accelerate() {
        System.out.println("The bicycle speeds up.");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle stops smoothly.");
    }
}

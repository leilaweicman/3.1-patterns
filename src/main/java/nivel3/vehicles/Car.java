package nivel3.vehicles;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car engine starts.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates on the road.");
    }

    @Override
    public void brake() {
        System.out.println("The car slows down and stops.");
    }
}

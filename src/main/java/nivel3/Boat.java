package nivel3;

public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("The boat starts its motor.");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat sails faster.");
    }

    @Override
    public void brake() {
        System.out.println("The boat slows down in the water.");
    }
}

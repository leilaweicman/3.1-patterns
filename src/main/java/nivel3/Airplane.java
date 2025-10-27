package nivel3;

public class Airplane implements Vehicle {
    @Override
    public void start() {
        System.out.println("The airplane engines start.");
    }

    @Override
    public void accelerate() {
        System.out.println("The airplane accelerates down the runway.");
    }

    @Override
    public void brake() {
        System.out.println("The airplane slows down after landing.");
    }
}

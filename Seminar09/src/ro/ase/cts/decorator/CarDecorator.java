package ro.ase.cts.decorator;

public abstract class CarDecorator implements Vehicle {
    private Vehicle vehicle;

    public CarDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void start() {
        vehicle.start();
    }

    @Override
    public void stop() {
        vehicle.stop();
    }
}

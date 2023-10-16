package session13_recap.challenges.abstraction;

public class Truck implements Vehicle{

    private String model;

    public Truck(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("The " + model + " starts its great engine with a plume of smoke.");
    }

    @Override
    public void stop() {
        System.out.println("The massive" + model + " finally stops.");
    }

    @Override
    public void accelerate() {
        System.out.println("The " + model + " slowly gains speed.");
    }
}

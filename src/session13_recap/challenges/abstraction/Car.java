package session13_recap.challenges.abstraction;

public class Car implements Vehicle{

    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("The " + model + " starts its engine.");
    }

    @Override
    public void stop() {
        System.out.println("The " + model + " comes to a stop.");
    }

    @Override
    public void accelerate() {
        System.out.println("The " + model + " accelerates.");
    }
}

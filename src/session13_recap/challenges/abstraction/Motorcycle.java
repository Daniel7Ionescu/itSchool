package session13_recap.challenges.abstraction;

public class Motorcycle implements Vehicle{

    private String model;

    public Motorcycle(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("The " + model + " quickly started its powerful engine.");
    }

    @Override
    public void stop() {
        System.out.println("The " + model + " comes to a screeching halt!");
    }

    @Override
    public void accelerate() {
        System.out.println("A motorcycle, model " + model + " just zipped by!");
    }
}

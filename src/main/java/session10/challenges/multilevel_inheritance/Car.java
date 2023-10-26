package session10.challenges.multilevel_inheritance;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The car makes a noise and starts up.");
    }

    public void stop() {
        System.out.println("The car comes to a halt.");
    }

    public void accelerate() {
        System.out.println("The car gains in speed!");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
}
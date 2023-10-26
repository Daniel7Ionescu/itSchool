package session10.challenges.multilevel_inheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year) {
        super(make, model, year);
    }

    public void charge() {
        System.out.println("The electric car is charging up.");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Electric car: " + super.getModel() + " model of: " + super.getYear() +
                "\nbatteryCapacity: " + batteryCapacity +
                "\nrange: " + range;
    }
}

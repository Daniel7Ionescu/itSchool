package session10.challenges.multilevel_inheritance;

public class Tesla extends ElectricCar {
    private String autopilotVersion;

    public Tesla(String make, String model, int year) {
        super(make, model, year);
    }

    public void enableAutopilot() {
        System.out.println("Autopilot enabled, time to pay even less attention to the road.");
    }

    @Override
    public void charge() {
        System.out.println("The Tesla is charging up, that's quite fast. ");
    }

    public String getAutopilotVersion() {
        return autopilotVersion;
    }

    public void setAutopilotVersion(String autopilotVersion) {
        this.autopilotVersion = autopilotVersion;
//        System.out.println("Autopilot version set to: " + autopilotVersion);
    }

    @Override
    public String toString() {
        return "Tesla car: " + super.getModel() + " model of: " + super.getYear() +
                "\nbatteryCapacity: " + super.getBatteryCapacity() +
                "\nrange: " + super.getRange() +
                "\nautopilot version: " + autopilotVersion;
    }
}

package session10.challenges.hierarchical_inheritance;

public class SpeedBoat extends Boat {
    private int maxSpeed;
    private String engineType;

    public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("The speed boat goes up to its maximum speed of: " + maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "This speed boat has a maximum speed of " + maxSpeed + " km/h thanks to its " + engineType + " engines." +
                "\nLength: " + getLength() + " meters, weight: " + getWeight() + "kgs.";
    }
}

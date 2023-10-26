package session10.challenges.single_inheritance;

public class MountainBike extends Bicycle {
    private String tireType;
    private String suspension;

    public MountainBike(int speed, int gear, String tireType, String suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(String type) {
        if (suspension.equals(type)) {
            System.out.println("The suspension is already: " + suspension);
            return;
        }

        suspension = type;
        System.out.println("Suspension set as: " + suspension);
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Mountain bike status: " +
                "\nspeed: " + super.getSpeed() +
                "\ngear: " + super.getGear() +
                "\ntire type: " + tireType +
                "\nsuspension: " + suspension;
    }
}

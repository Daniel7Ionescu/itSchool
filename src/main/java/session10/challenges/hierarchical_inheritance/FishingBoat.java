package session10.challenges.hierarchical_inheritance;

public class FishingBoat extends Boat {
    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("The fishing boat casts its " + typeOfNet + " wide and far.");
    }

    public int getFishCapacity() {
        return fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }

    public void setTypeOfNet(String typeOfNet) {
        this.typeOfNet = typeOfNet;
    }

    @Override
    public String toString() {
        return "This fishing boat is equiped with " + typeOfNet + " and has a fishing capacity of " + fishCapacity + " kgs." +
                "\nLength: " + getLength() + " meters, weight: " + getWeight() + "kgs";

    }
}

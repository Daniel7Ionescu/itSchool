package session10.challenges.hierarchical_inheritance;

public class Boat {
    private int length;
    private int weight;

    public Boat(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail(){
        System.out.println("The boat is sailing.");
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }
}

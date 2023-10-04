package session10.challenges.hierarchical_inheritance;

public class HierarchicalTest {

    public static void main(String[] args) {
        SpeedBoat speedBoat = new SpeedBoat(7, 3200, 270, "Turbo Duck 77");
        System.out.println(speedBoat);

        FishingBoat fishingBoat = new FishingBoat(17, 1100, 7000, "Fat Pelican Net27");
        System.out.println(fishingBoat);
    }
}

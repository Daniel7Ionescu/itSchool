package session10.challenges.single_inheritance;

public class SingleInheritanceTest {

    public static void main(String[] args) {
        MountainBike mtb = new MountainBike(0, 3, "road", "stiff");
        System.out.println(mtb);

        mtb.speedUp(10);
        mtb.changeGear('+');
        mtb.adjustSuspension("soft");
        System.out.println(mtb);
    }
}

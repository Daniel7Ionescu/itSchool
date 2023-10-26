package session15_equals_hashcode.challenges.enum_light_color_6;

public class LightColorApp {

    public static void main(String[] args) {
        System.out.println("Whats does green mean: " + LightColor.GREEN.getUseCase());
        System.out.println("How long does Stop last: " + LightColor.RED.getDuration());
        System.out.println("Info on Yellow: " + LightColor.YELLOW.getUseCase() + " : " + LightColor.YELLOW.getDuration());
    }
}

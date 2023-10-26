package session15_equals_hashcode.challenges.traffic_light_system_14;

public class TrafficLight {

    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    public void cycleTrafficLight() {
        System.out.println("The traffic light is now: " + light + " " + light.getInstruction() + " for " + light.getDuration() + " seconds.");

        try {
            Thread.sleep(light.getDuration() * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        cycle();
    }

    private void cycle() {
        switch (light) {
            case RED -> light = Light.GREEN;
            case GREEN -> light = Light.YELLOW;
            case YELLOW -> light = Light.RED;
        }
    }

    private void showCounter() {
        int counter = light.getDuration();
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
    }
}

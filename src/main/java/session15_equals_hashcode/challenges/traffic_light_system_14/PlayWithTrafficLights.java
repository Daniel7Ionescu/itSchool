package session15_equals_hashcode.challenges.traffic_light_system_14;

public class PlayWithTrafficLights {

    public static void main(String[] args) {
        Light light = Light.RED;
        TrafficLight trafficLight = new TrafficLight(light);

        int limit = 6;
        while (limit > 0) {
            trafficLight.cycleTrafficLight();
            limit--;
        }
    }
}

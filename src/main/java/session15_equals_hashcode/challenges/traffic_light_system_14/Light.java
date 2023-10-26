package session15_equals_hashcode.challenges.traffic_light_system_14;

public enum Light {

    RED("Stop", 3),
    YELLOW("Caution", 3),
    GREEN("Go", 5);

    private String instruction;
    private int duration;

    Light(String instruction, int duration) {
        this.instruction = instruction;
        this.duration = duration;
    }

    public String getInstruction() {
        return instruction;
    }

    public int getDuration() {
        return duration;
    }
}

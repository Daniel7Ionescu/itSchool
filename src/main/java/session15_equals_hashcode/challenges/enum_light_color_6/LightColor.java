package session15_equals_hashcode.challenges.enum_light_color_6;

public enum LightColor {
    RED("Stop",30),
    YELLOW("Caution", 5),
    GREEN("GO", 45);

    private String useCase;
    private int duration;

    LightColor(String useCase, int duration) {
        this.useCase = useCase;
        this.duration = duration;
    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

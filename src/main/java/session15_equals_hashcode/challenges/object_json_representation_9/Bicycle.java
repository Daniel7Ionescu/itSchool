package session15_equals_hashcode.challenges.object_json_representation_9;

public class Bicycle {

    private String color;
    private String howCoolIsIt;

    private boolean isFast;
    private boolean hasACoolSticker;

    public Bicycle(String color, String howCoolIsIt, boolean isFast, boolean hasACoolSticker) {
        this.color = color;
        this.howCoolIsIt = howCoolIsIt;
        this.isFast = isFast;
        this.hasACoolSticker = hasACoolSticker;
    }

    @Override
    public String toString() {
        return "Color " + color + " Cool " + howCoolIsIt + " Speed " + isFast + " Sticker " + hasACoolSticker;
    }
}

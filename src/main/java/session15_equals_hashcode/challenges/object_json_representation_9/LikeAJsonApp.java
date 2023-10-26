package session15_equals_hashcode.challenges.object_json_representation_9;

public class LikeAJsonApp {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Blue", "Very!", true, true);
        System.out.println(bicycle);

        LikeAJson.printObjectLikeAJson(bicycle);
    }
}

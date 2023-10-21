package session15_equals_hashcode.challenges.equals_hashcode_challenges_1_to_5.rectangle_1;

public class RectangleApp {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(10);
        rectangle1.setWidth(10);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(10);
        rectangle2.setWidth(10);

        System.out.println("rectangle1 hashcode: " + rectangle1.hashCode());
        System.out.println("rectangle2 hashcode: " + rectangle2.hashCode());
        System.out.println("rectangle1 equals rectangle2: " + rectangle1.equals(rectangle2));
    }
}

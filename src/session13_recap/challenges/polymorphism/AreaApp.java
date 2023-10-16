package session13_recap.challenges.polymorphism;

public class AreaApp {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(25, 9);
        Shape triangle = new Triangle(5, 7, 4);
        Shape circle = new Circle(25.5);

        System.out.println("The area of the rectangle with : " + rectangle + " is: " + rectangle.area());
        System.out.println("The area of the triangle with: " + triangle + " is: " + triangle.area());
        System.out.println("The area of the circle: " + circle + " is: " + circle.area());
    }
}

package session12_polymorphism.practice.has_a;


public class HasAApp {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
        car.drive();

    }
}

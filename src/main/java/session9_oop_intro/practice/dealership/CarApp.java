package session9_oop_intro.practice.dealership;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Dacia");
        car1.setModel("1310");
        car1.setSpeed(30);

        System.out.println(car1);
//        System.out.println("My car brand: " + car1.getBrand());

        car1.accelerate();
        car1.accelerate();
        System.out.println("Accelerating two times, speed is: " + car1.getSpeed());
        car1.decelerate();
        System.out.println("Breaking once, speed is: " + car1.getSpeed());
    }
}

package session13_recap.challenges.abstraction;

public class AbstractionApp {

    public static void main(String[] args) {
        Vehicle car = new Car("Ford F-150");
        Vehicle truck = new Truck("Volvo Globetrotter");
        Vehicle motorBike = new Motorcycle("Kawasaki Ninja");

        truck.start();
        motorBike.start();
        car.stop();
        truck.accelerate();
        car.start();
        motorBike.accelerate();
        car.start();
    }
}

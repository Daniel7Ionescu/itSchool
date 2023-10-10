package session12_polymorphism.practice.object_vs_reference;

public class ObjVsRefApp {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle truck = new Truck();

        Car car2 = (Car) car;



        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());


        Car someCar = new Car();
        Object carAsObject = someCar;
//        carAsObject.fuelType(); // compile error
        Car backToCar = (Car) carAsObject;
        backToCar.fuelType();
    }
}

package session11_abstractization.practice.vehicle_example;

public abstract class Vehicle {

    int speed;

    abstract void accelerate();
    abstract void brake();

    void autoPilot(){

    }

    void retractableHood(){
        System.out.println("Hood on/off.");
    }
}

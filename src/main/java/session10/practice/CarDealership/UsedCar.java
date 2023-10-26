package session10.practice.CarDealership;

public class UsedCar extends Car{

    private int previousOwners;
    private double mileage;

    public UsedCar(String model, int year, double price, int previousOwners, double mileage){
        super(model, year, price);
        this.previousOwners = previousOwners;
        this.mileage = mileage;
    }

    public int getPreviousOwners() {
        return previousOwners;
    }

    public void setPreviousOwners(int previousOwners) {
        this.previousOwners = previousOwners;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

package session18_recap.challenges.class_pair_16;

public class ClassPairApp {

    public static void main(String[] args) {
        //Problem 16
        //Design a generic class Pair<T, U> that can hold two items of potentially different types.
        //Implement methods to retrieve each item.
        ClassPair<Truck, Cargo> truckClassPair = new ClassPair<>();
        truckClassPair.settType(new Truck("Ford Big Truck 5000", false));
        truckClassPair.setuType(new Cargo("Industrial", 1500));

        Truck truckFord = truckClassPair.gettType();
        Cargo cargoTrainParts = truckClassPair.getuType();

        System.out.println("Truck: " + truckFord +
                "\nLoad: " + cargoTrainParts);
    }
}

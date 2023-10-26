package session15_equals_hashcode.challenges.generic_repository_16;

public class GenericRepoApp {

    public static void main(String[] args) {
        GenericRepo genericRepo = new GenericRepo();

        Animal animalCow = new Animal("Cow", "Brown");
        Animal animalCow2 = new Animal("Cow", "Brown");
        Animal animalBull = new Animal("Bull", "Brown");

        Car carTesla = new Car("Tesla", true);
        Car carTruck = new Car("Big Truck 5000", false);

        genericRepo.addObject(animalCow);
        genericRepo.addObject(animalBull);
        genericRepo.addObject(animalCow2);

        genericRepo.addObject(carTesla);
        genericRepo.addObject(carTruck);
        genericRepo.addObject(carTesla);

        System.out.println(genericRepo.getRepository());
    }
}

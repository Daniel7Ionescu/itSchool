package session12_polymorphism.practice.runtime_polymorphism.animals;

public class Dog extends Animal{

    @Override
    public String sound() {
        return "Bark!";
    }
}

package session12_polymorphism.practice.change_behaviour_at_runtime;

public class Bow implements Weapon{
    @Override
    public void use() {
        System.out.println("Shooting the bow!");
    }
}

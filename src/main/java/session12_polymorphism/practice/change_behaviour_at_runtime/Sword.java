package session12_polymorphism.practice.change_behaviour_at_runtime;

public class Sword implements Weapon{
    @Override
    public void use() {
        System.out.println("Swinging the sword!");
    }
}

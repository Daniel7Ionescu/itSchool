package session12_polymorphism.practice.change_behaviour_at_runtime;

public class TestGameplay {

    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter(new Sword());

        hero.attack();

        hero.setWeapon(new Bow());
        hero.attack();
    }
}

package session10.practice.inheritance;

public class HierarchicalInheritance {
}

class Animal {
    void makeSound(){
        System.out.println("Generic animal roar");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow goes moo");
    }
}

class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println("Duck goes quack!");
    }
}

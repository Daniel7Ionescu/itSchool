package session10.practice.inheritance;

public class SingleInheritance {

}

class Parentx {
    void displayParent() {
        System.out.println("This is a parent class method.");
    }
}

class Childx extends Parentx {
    @Override
    void displayParent() {
        System.out.println("This is a child class method.");
    }
}
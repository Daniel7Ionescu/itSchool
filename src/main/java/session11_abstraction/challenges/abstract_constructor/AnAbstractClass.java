package session11_abstraction.challenges.abstract_constructor;

public abstract class AnAbstractClass {

    public AnAbstractClass() {
        System.out.println("This is constructor of abstract class.");
    }

    public abstract void a_method();

    public void concrete_method(){
        System.out.println("This is a normal method of abstract class.");
    }
}

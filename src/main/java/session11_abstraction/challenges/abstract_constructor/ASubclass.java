package session11_abstraction.challenges.abstract_constructor;

public class ASubclass extends AnAbstractClass{
    @Override
    public void a_method() {
        System.out.println("This is an abstract method.");
    }

    @Override
    public void concrete_method() {
        super.concrete_method();
    }
}

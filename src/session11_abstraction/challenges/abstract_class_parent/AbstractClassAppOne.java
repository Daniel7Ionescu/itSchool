package session11_abstraction.challenges.abstract_class_parent;

public class AbstractClassAppOne {

    public static void main(String[] args) {
        SubclassOne subclassOne = new SubclassOne();
        SubclassTwo subclassTwo = new SubclassTwo();

        subclassOne.message();
        subclassTwo.message();
    }
}

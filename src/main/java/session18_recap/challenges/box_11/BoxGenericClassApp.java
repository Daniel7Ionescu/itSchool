package session18_recap.challenges.box_11;

public class BoxGenericClassApp {

    public static void main(String[] args) {
        //Problem 11
        //Create a generic class Box<T> that can store a single item of any type.
        //Implement methods to set and get the item from the box.

        Box<String> stringBox = new Box<>();
        stringBox.setItem("A duck that goes quack!");

        System.out.printf("What's in the box: %s", stringBox.getItem() );
    }
}

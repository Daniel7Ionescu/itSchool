package session8Wrapppers.challenges;

import java.util.Arrays;

public class ArrayShoppingList {

    public static void main(String[] args) {
        String[] shoppingList = {"Towels", "Toothpaste", "Light bulbs"};

        //print with method
        System.out.println("Print with method:");
        System.out.println(Arrays.toString(shoppingList));

        //print with loop
        System.out.println("Print with loop, each item on a new line:");
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}

package session14_collections.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> pets = initSet();
        displaySetElements(pets);
    }

    private static void displaySetElements(Set<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    private static Set<String> initSet() {
        Set<String> mySet = new HashSet<>();
        mySet.add("Dog");
        mySet.add("Cat");
        mySet.add("Duck");
        mySet.add("Duck");

        return mySet;
    }
}

package session8_wrapppers.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add(0, "Bob");
        names.add(0, "Ana");

        System.out.println(names);
        if(names.isEmpty()){
            System.out.println("No one here");
        } else {
            System.out.println("Not empty, size: " + names.size());
        }

        String firstName = names.get(0);
        System.out.println("First name: " + firstName);
    }
}

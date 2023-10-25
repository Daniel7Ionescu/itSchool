package session16_lambda_functional_interface.challenges.sort_alphabetical_and_reverse_4;

import java.util.ArrayList;
import java.util.List;

public class TestSortString {

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(List.of("Dog", "Cat", "Fish", "Platypus"));
        System.out.println("Starting list: " + pets);

        pets.sort((str1, str2) -> str1.compareTo(str2));
        System.out.println("List sorted alphabetically: " + pets);
        pets.sort((str1, str2) -> str2.compareTo(str1));
        System.out.println("List sorted reversed: " + pets);
    }
}

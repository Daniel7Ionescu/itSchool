package session16_lambda_functional_interface.challenges.sort_list_of_strings_abc_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortAlphabeticalOrder {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("red", "yellow", "blue", "green"));
        System.out.println("Unsorted list: " + colors);

        //sort
        colors.sort((String color1, String color2) -> color1.compareTo(color2));
        System.out.println("Sorted list: " + colors);

        //shuffle and use instance method reference
        Collections.shuffle(colors);
        System.out.println("List shuffled: " + colors);
        Collections.sort(colors, Comparator.comparing(String::valueOf));
        System.out.println("Sorted again: " + colors);
    }
}

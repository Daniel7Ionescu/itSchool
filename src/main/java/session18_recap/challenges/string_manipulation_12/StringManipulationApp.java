package session18_recap.challenges.string_manipulation_12;

import java.util.*;

public class StringManipulationApp {

    public static void main(String[] args) {
        //Problem 12
        //For a list of strings, create a method that filters out strings with fewer than 5 characters,
        //then converts each string to uppercase, and finally sorts them in reverse order.
        List<String> inputString = Arrays.asList("Balloons", "Red", "Yellow", "Duck", "Midsummer");
        List<String> processedInputString = getSortedAndReversed(inputString);
        System.out.printf("Filtered and reversed: %s", processedInputString);
    }

    private static List<String> getSortedAndReversed(List<String> stringList) {
        return stringList.stream()
                .filter(string -> string.length() > 5)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}

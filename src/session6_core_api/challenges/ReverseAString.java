package session6_core_api.challenges;

public class ReverseAString {

    public static void main(String[] args) {
        printStringReverse("My little cow goes moon on the hill every night.");
    }

    private static void printStringReverse(String input) {
        StringBuilder reverseString = new StringBuilder(input);
        System.out.println(reverseString.reverse());
    }
}
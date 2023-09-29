package session6_core_api.challenges;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("ABA"));
    }

    private static boolean isStringPalindrome(String input) {
        StringBuilder reverseString = new StringBuilder(input);
        return input.equals(reverseString.reverse().toString());
    }
}
package session6CoreApi.challenges;

public class PatternRecognition {

    public static void main(String[] args) {
        String str = "abcdefabcgh";
        String pattern = "abc";
        System.out.println(hasPattern(str, pattern));
    }

    private static boolean hasPattern(String input, String pattern) {
        if (pattern.length() > input.length()) {
            return false;
        }
        int patternLength = pattern.length();
        int counter = 0;
        int patternMatches = 0;

        while (counter < input.length() - patternLength) {
            if (input.toLowerCase().substring(counter, counter + patternLength).equals(pattern.toLowerCase())) {
                patternMatches++;
            }
            counter++;
        }
        return patternMatches > 1;
    }
}

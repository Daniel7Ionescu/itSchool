package session6_core_api.challenges;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "War";
        String str2 = "Raw";

        System.out.println(isAnagram(str1, str2));


    }

    private static boolean isAnagram(String str1, String str2) {
        //if length is != then false
        if (str1.length() != str2.length()) {
            return false;
        }

        StringBuilder testStr = new StringBuilder(str1.toLowerCase());
        int counter = str1.length();

        //if we find a common char, counter--, replace char with non letter
        for (int checkerIndex = 0; checkerIndex < str2.length(); checkerIndex++) {
            for (int index = 0; index < testStr.length(); index++) {
                if (str2.toLowerCase().charAt(checkerIndex) == testStr.charAt(index)) {
                    counter--;
                    testStr.replace(index, index + 1, "_");
                }
            }
        }
        return counter == 0 ? true : false;
    }
}

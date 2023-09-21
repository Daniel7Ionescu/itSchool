package session6CoreApi.challenges;

public class StringInterleaver {

    public static void main(String[] args) {
        String str1 = "Goege uc";
        String str2 = "os osqak";
        System.out.println(interleaveStrings(str1, str2));
    }

    private static String interleaveStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < str1.length(); index++) {
            result.append(str1.charAt(index)).append(str2.charAt(index));
        }
        return result.toString();
    }
}

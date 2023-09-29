package session6_core_api.challenges;

public class RemovingVowels {

    public static void main(String[] args) {
        // with for loop
        System.out.println(removeVowelsForLoop("Cow goes moo"));

        //with replace-regex
        String str1 = "Cow goes moo";
        String str1NoVowels = "";
        str1NoVowels = str1.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String: '" + str1 + "' with vowels removed: " + str1NoVowels);
    }

    private static String removeVowelsForLoop(String input) {
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (!isVowel(input.charAt(index))) {
                updatedString.append(input.charAt(index));
            }
        }
        return updatedString.toString();
    }

    private static boolean isVowel(char character) {
        char[] charArray = {'a', 'e', 'i', 'o', 'u'};
        char c = Character.toLowerCase(character);
        for (int index = 0; index < charArray.length; index++) {
            if (c == charArray[index]) {
                return true;
            }
        }
        return false;
    }
}
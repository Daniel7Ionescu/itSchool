package session6_core_api.challenges;

public class DuplicateCharacterRemover {

    public static void main(String[] args) {
        String str = "The baboon has a red balloon";
        System.out.println(removeDuplicateChars(str));
    }

    private static String removeDuplicateChars(String input) {
        StringBuilder updatedString = new StringBuilder();
        char[] charArr = input.toCharArray();

        for (int index = 0; index < charArr.length; index++) {
            if (index < charArr.length - 1 && charArr[index] == charArr[index + 1]) {
                continue;
            }
            updatedString.append(charArr[index]);
        }
        return updatedString.toString();
    }
}

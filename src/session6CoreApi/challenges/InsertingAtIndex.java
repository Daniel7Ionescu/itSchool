package session6CoreApi.challenges;

public class InsertingAtIndex {

    public static void main(String[] args) {
        String starterString = "This is a String";
        String insertString = "cool";
        int targetIndex = 9;

        System.out.println(insertStringAtIndex(starterString, insertString, targetIndex));

    }

    private static String insertStringAtIndex(String input, String newString, int targetIndex) {
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            updatedString.append(input.charAt(index));
            if (index == targetIndex) {
                updatedString.append(newString);
            }
        }
        return updatedString.toString();
    }

}

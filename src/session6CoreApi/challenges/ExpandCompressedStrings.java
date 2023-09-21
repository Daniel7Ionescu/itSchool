package session6CoreApi.challenges;

public class ExpandCompressedStrings {

    public static void main(String[] args) {
        String compressedStr = "a3b2c4";
        System.out.println("Compressed String : " + compressedStr + " decompressed: " + expandedString(compressedStr));
    }

    private static String expandedString(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            if (Character.isDigit(str.charAt(index))) {
                int counter = Character.getNumericValue(str.charAt(index)) - 1;
                while (counter > 0) {
                    newStr.append(str.charAt(index - 1));
                    counter--;
                }
                continue;
            }
            newStr.append(str.charAt(index));
        }
        return newStr.toString();
    }
}

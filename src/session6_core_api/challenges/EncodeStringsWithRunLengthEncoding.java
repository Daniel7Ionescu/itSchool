package session6_core_api.challenges;

public class EncodeStringsWithRunLengthEncoding {

    public static void main(String[] args) {
        String str = "AAAABBBCCDDDDDDDEEE";
        System.out.println(encodeStringRLE(str));
    }

    private static String encodeStringRLE(String input) {
        StringBuilder encoded = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            //char starts with count 1
            int count = 1;
            //while we are not the last char and dont go out of bounds and the next char is ==
            while (index < input.length() - 1 && input.toLowerCase().charAt(index) == input.toLowerCase().charAt(index + 1)) {
                count++;
                //increment index so we can skip to different char when we escape while
                index++;
            }
            encoded.append(count).append(input.charAt(index));
        }
        return encoded.toString();
    }
}
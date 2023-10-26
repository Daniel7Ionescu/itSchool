package session6_core_api.challenges;

public class EncodeDecodeCaesarCipher {

    public static void main(String[] args) {
        String starterMessage = "ROMANSRULE";
        //key range 1 - 25
        int key = 7;

        System.out.println("Original message: " + starterMessage);
        String encodedMessage = caesarCipher(starterMessage, key);
        System.out.println("Encoded: " + encodedMessage);
        String decodedMessage = caesarCipher(encodedMessage, key, "decode");
        System.out.println("Decoded: " + decodedMessage);
    }

    private static String caesarCipher(String message, int key, String... operation) {
        StringBuilder newStr = new StringBuilder();
        if (operation.length > 0) {
            key = operation[0].equals("decode") ? 26 - key : key;
        }

        for (int index = 0; index < message.length(); index++) {
            //cast to int, get the ASCII code, shift by key value and stay in the range of capital letters 65-90
            //a -> A -> 65 + key(1) - it's own code(65) % 26 -> key(1) + 65 -> ASCII code of the new letter
            int letterCode = ((int) (message.toUpperCase().charAt(index) + key - 65) % 26 + 65);
            //add the new letter to newStr
            newStr.append((char) letterCode);
        }
        return newStr.toString();
    }
}
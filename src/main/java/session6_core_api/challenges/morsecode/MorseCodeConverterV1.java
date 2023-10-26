package session6_core_api.challenges.morsecode;

public class MorseCodeConverterV1 {

    public static void main(String[] args) {
        String str = "Cow goes moo";
        System.out.println(stringToMorseCode(str));
    }

    private static String stringToMorseCode(String input) {
        StringBuilder morseStr = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            morseStr.append(charToMorseCode(input.toLowerCase().charAt(index)) + " ");
        }
        return morseStr.toString();
    }

    private static String charToMorseCode(char character) {
        return switch (character) {
            case 'a' -> "*-";
            case 'b' -> "-***";
            case 'c' -> "-*-*";
            case 'd' -> "-**";
            case 'e' -> "*";
            case 'f' -> "**-*";
            case 'h' -> "--*";
            case 'i' -> "**";
            case 'j' -> "*---";
            case 'k' -> "-*-";
            case 'l' -> "*-**";
            case 'm' -> "--";
            case 'n' -> "-*";
            case 'o' -> "---";
            case 'p' -> "*--*";
            case 'q' -> "--*-";
            case 'r' -> "*-*";
            case 's' -> "***";
            case 't' -> "-";
            case 'u' -> "**-";
            case 'v' -> "***-";
            case 'w' -> "*--";
            case 'x' -> "-**-";
            case 'y' -> "-*--";
            case 'z' -> "--**";
            case '1' -> "*----";
            case '2' -> "**---";
            case '3' -> "***--";
            case '4' -> "****-";
            case '5' -> "*****";
            case '6' -> "-****";
            case '7' -> "--***";
            case '8' -> "---**";
            case '9' -> "----*";
            case '0' -> "-----";
            default -> " ";
        };
    }
}
package session6CoreApi.challenges.morsecode;

public class MorseCodeConverterV2 {

    public static void main(String[] args) {
        String str1 = "Cow goes moo";
        System.out.println(stringToMorse(str1, MorseDB.abc, MorseDB.symbol));
    }

    private static String stringToMorse(String input, char[] abc, String[] symbol) {
        StringBuilder strCode = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            for (int abcIndex = 0; abcIndex < abc.length; abcIndex++) {
                if (input.toLowerCase().charAt(index) == abc[abcIndex]) {
                    strCode.append(symbol[abcIndex] + " ");
                }
            }
        }
        return strCode.toString();
    }
}
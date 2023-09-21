package session6CoreApi.challenges;

public class TogglingCase {

    public static void main(String[] args) {
        String str = "mY liTTle CoW goOEs mOO oN tHE HilL";
        System.out.println("Original str: " + str);
        System.out.println("Toggled str: " + toggleCase(str));
    }

    private static String toggleCase(String input) {
        StringBuilder toggleStr = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            if (Character.isUpperCase(input.charAt(index))) {
                toggleStr.append(Character.toLowerCase(input.charAt(index)));
            } else {
                toggleStr.append(Character.toUpperCase(input.charAt(index)));
            }
        }
        return toggleStr.toString();
    }
}

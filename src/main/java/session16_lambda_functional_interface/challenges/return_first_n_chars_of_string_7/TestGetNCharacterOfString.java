package session16_lambda_functional_interface.challenges.return_first_n_chars_of_string_7;

public class TestGetNCharacterOfString {

    public static void main(String[] args) {
        String string1 = "Duck";

        CharFinder charFinder = (str, n) -> n < str.length() ? str.substring(0, n) : str;
        System.out.println(charFinder.getNChars(string1, 2));
    }
}

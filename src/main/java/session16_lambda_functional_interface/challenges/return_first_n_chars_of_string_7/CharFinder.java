package session16_lambda_functional_interface.challenges.return_first_n_chars_of_string_7;

@FunctionalInterface
public interface CharFinder {

    String getNChars(String string, int n);
}

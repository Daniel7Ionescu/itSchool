package session16_lambda_functional_interface.challenges.fun_interface_6;

public class TestTwoStringsFunInterface {

    public static void main(String[] args) {
        String string1 = "Horse";
        String string2 = "Cat";

        StringCompare stringCompare = (str1, str2) -> str1.length() > str2.length() ? str1.length() : str2.length();
        System.out.println("The longest string has a length of: " + stringCompare.maxLengthValue(string1, string2));
    }
}

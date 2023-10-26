package session16_lambda_functional_interface.challenges.join_two_strings_12;

public class TestJoinTwoStrings {

    public static void main(String[] args) {
        String string1 = "Cow";
        String string2 = "goes moo!";

        StringManipulator stringManipulator = (s1, s2) -> s1 + " " + s2;
        String joinedString = stringManipulator.join(string1, string2);
        System.out.println("Joining '" + string1 + "' with '" + string2 + "': " + joinedString);
    }
}

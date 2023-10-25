package session16_lambda_functional_interface.challenges.return_square_root_13;

public class TestSquareRoot {

    public static void main(String[] args) {
        Double myNumber = 2.0;
        NumberModifier numberModifier = num -> Math.sqrt(num);

        System.out.println("Square root of: " + myNumber + " is: " + numberModifier.getSquareRoot(myNumber));
    }
}

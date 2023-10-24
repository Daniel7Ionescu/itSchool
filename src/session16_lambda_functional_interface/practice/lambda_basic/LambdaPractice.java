package session16_lambda_functional_interface.practice.lambda_basic;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        IntMultiply getMulti = (a, b) -> a * b;

        System.out.println("Sum from IntSum: " + getSum.sum(2, 3));
        System.out.println("Multi from IntMultiply: " + getMulti.multiply(2, 3));

        List<String> names = new ArrayList<>();
        names.add("Wendy");
        names.add("Kenny");

        names.forEach(name -> System.out.println(name));
    }
}

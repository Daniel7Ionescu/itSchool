package session16_lambda_functional_interface.practice.built_in_funct_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaStringModifier {

    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();
        System.out.println(getLength.apply("Hello"));

        List<String> myList = new ArrayList<>(List.of("Cow", "Chicken", "Dog"));
        myList.stream()
                .filter(name -> name.startsWith("C"))
                .forEach(System.out::println);


    }
}

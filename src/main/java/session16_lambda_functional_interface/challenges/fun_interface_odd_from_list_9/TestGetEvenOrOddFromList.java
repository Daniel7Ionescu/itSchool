package session16_lambda_functional_interface.challenges.fun_interface_odd_from_list_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestGetEvenOrOddFromList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntListProcessor intListProcessor = list -> list.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Only odd numbers: " + intListProcessor.getOnlyOdd(integerList));
    }
}

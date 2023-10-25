package session16_lambda_functional_interface.challenges.filter_list_with_lambda_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestsLambdaFilter {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 7, 3, 27, 15, 4, 82, 5);

        //for each
        List<Integer> onlyEvenNums = new ArrayList<>();
        integerList.forEach(num -> {
            if (num % 2 == 0) onlyEvenNums.add(num);
        });
        System.out.println("Result with for each: " + onlyEvenNums);

        //using stream
        List<Integer> resultFromWithStream = integerList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Result with stream: " + resultFromWithStream);
    }
}

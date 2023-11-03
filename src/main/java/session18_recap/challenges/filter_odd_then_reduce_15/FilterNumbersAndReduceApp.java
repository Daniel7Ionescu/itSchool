package session18_recap.challenges.filter_odd_then_reduce_15;

import java.util.Arrays;
import java.util.List;

public class FilterNumbersAndReduceApp {

    public static void main(String[] args) {
        //Problem 15
        //For a list of integers, filter out even numbers,
        // then find the product of all remaining odd numbers using the reduce operation.

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfOdds = integerList.stream()
                .filter(num -> num % 2 != 0)
                .reduce(0, (acc, value) -> acc + value);
        System.out.printf("Sum of odd numbers: %d", sumOfOdds);
    }
}

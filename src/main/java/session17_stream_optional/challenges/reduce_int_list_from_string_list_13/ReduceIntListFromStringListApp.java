package session17_stream_optional.challenges.reduce_int_list_from_string_list_13;

import java.util.Arrays;
import java.util.List;

import static session17_stream_optional.challenges.reduce_int_list_from_string_list_13.ReduceIntListFromStringList.*;

public class ReduceIntListFromStringListApp {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        int sum = reduceFromStrList(numbers);
        System.out.println("Sum of integers from list of strings: " + sum);
    }
}

package session17_stream_optional.challenges.reduce_int_list_from_string_list_13;

import java.util.List;

public class ReduceIntListFromStringList {

    static int reduceFromStrList(List<String> numbers) {
        return numbers.stream()
                .map(Integer::valueOf)
                .reduce(0, (acc, value) -> acc + value);
    }
}

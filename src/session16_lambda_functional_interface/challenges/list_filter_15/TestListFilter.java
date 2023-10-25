package session16_lambda_functional_interface.challenges.list_filter_15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestListFilter {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        ListFilter listFilter = (list, predicate) -> list.stream()
                .filter(predicate).toList();
        Predicate<Integer> isEven = t -> t % 2 == 0;

        List<Integer> onlyEven = listFilter.filter(integerList, isEven);
        System.out.println("Filtered list: " + onlyEven);
    }
}

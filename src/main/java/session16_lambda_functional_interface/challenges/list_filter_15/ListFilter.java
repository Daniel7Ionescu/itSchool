package session16_lambda_functional_interface.challenges.list_filter_15;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface ListFilter <T>{

    List<?> filter(List<T> list, Predicate<T> predicate);
}

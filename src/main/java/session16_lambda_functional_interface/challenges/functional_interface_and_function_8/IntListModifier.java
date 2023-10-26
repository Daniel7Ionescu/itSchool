package session16_lambda_functional_interface.challenges.functional_interface_and_function_8;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface IntListModifier {
    List<Integer> modifyList(List<Integer> integerList, Function<Integer, Integer> function);
}

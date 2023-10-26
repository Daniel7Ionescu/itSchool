package session16_lambda_functional_interface.challenges.fun_interface_max_value_from_list_5;

import java.util.List;

@FunctionalInterface
public interface MaxValue {

    int maxValueFromList(List<Integer> integerList);
}

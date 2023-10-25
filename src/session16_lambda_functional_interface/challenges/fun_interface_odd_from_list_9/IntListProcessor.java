package session16_lambda_functional_interface.challenges.fun_interface_odd_from_list_9;

import java.util.List;

@FunctionalInterface
public interface IntListProcessor {

    List<Integer> getOnlyOdd(List<Integer> list);
}

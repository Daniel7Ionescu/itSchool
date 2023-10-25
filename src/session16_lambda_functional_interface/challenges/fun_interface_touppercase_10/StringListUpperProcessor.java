package session16_lambda_functional_interface.challenges.fun_interface_touppercase_10;

import java.util.List;

@FunctionalInterface
public interface StringListUpperProcessor {
    List<String> process(List<String> stringList);
}

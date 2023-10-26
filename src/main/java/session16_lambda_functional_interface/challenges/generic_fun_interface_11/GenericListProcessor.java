package session16_lambda_functional_interface.challenges.generic_fun_interface_11;

import java.util.List;

@FunctionalInterface
public interface GenericListProcessor<T> {
    boolean isItemInList(List<?> list, T item);
}

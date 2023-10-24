package session16_lambda_functional_interface.practice.conditonal_printer;

@FunctionalInterface
public interface ConditionalPrinter {

    void printIfTrue(String string, boolean condition);
}

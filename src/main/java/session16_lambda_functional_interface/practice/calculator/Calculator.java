package session16_lambda_functional_interface.practice.calculator;

@FunctionalInterface
public interface Calculator {

    double calculate(double a, double b, char operator);
}

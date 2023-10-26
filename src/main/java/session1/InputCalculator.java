package session1;

import java.util.Scanner;

public class InputCalculator extends Calculator {

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operation = scanner.nextInt();

        if (operation == 1) {
            result = add(num1, num2);
        } else if (operation == 2) {
            result = (sub(num1, num2));
        } else if (operation == 3) {
            result = multi(num1, num2);
        } else if (operation == 4) {
            result = div(num1, num2);
        } else {
            System.out.println("Invalid option, aborted!");
            scanner.close();
            return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }

}

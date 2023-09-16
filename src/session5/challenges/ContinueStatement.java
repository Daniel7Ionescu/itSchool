package session5.challenges;

import java.util.Scanner;

public class ContinueStatement {

    public static void main(String[] args) {
        printSumOfNumbersGreaterThanMinValue(5);
    }

    private static void printSumOfNumbersGreaterThanMinValue(int minValue) {
        Scanner scanner = new Scanner(System.in);
        int counter = 3;
        int sum = 0;

        optionRunning:
        while (counter > 0) {
            System.out.println("(Remaining inputs : " + counter + " ) Enter a number greater than " + minValue + " to be summed up");
            counter--;
            int userInput = scanner.nextInt();
            if (userInput < minValue) {
                continue optionRunning;
            }
            sum += userInput;
        }

        System.out.println("The sum of valid numbers is: " + sum);
        scanner.close();
    }
}

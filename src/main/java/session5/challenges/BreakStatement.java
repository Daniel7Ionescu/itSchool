package session5.challenges;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args) {
        printAverageOfInputNumbers();
    }

    private static void printAverageOfInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        optionRunning:
        while (true) {
            printOptions();
            int userInput = scanner.nextInt();
            if (userInput != 0)
                optionValid:
                        {
                            sum += userInput;
                            counter++;
                            break optionValid;
                        }
            else if (userInput == 0 && counter == 0) {
                System.out.println("App exited");
                break optionRunning;
            } else {
                System.out.println("The average is: " + (sum / counter));
                break optionRunning;
            }
        }
    }

    private static void printOptions() {
        System.out.println("Enter a number.");
        System.out.println("Enter 0 to exit.");
    }
}

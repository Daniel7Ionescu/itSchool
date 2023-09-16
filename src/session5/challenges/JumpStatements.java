package session5.challenges;

import java.util.Scanner;

public class JumpStatements {

    public static void main(String[] args) {
        giveMeOptions();
    }

    private static void giveMeOptions() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        optionRunning:
        while (true) {
            printOptions();
            userInput = scanner.nextInt();
            if (userInput == 1) {
                optionPrintHelloWorld:
                {
                    System.out.println("Hello world!");
                    break optionPrintHelloWorld;
                }
            } else if (userInput == 2)
                optionPrintUseName:
                        {
                            System.out.println("The use name is Dan.");
                            break optionPrintUseName;
                        }
            else {
                break optionRunning;
            }
        }
    }

    private static void printOptions() {
        System.out.println("Select an option");
        System.out.println("1. Print 'Hello World'");
        System.out.println("2. Print use name.");
        System.out.println("3. Exit");
    }
}

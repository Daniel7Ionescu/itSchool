package session5.challenges;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        guessTheNumber(10);
    }

    private static void guessTheNumber(int targetValue) {
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessed = false;

        System.out.println("Welcome to number guesser, enter a number to begin!");
        do {
            int input = scanner.nextInt();
            if (input > targetValue) {
                System.out.println("You went too high!");
            } else if (input < targetValue) {
                System.out.println("You went too low!");
            } else {
                hasGuessed = true;
            }
        } while (!hasGuessed);

        System.out.println("Insert : generic congratulations message!");
        scanner.close();
    }
}

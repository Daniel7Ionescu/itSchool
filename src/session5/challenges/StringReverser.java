package session5.challenges;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        getInputAndReverse();
    }

    private static void reverseStringForLoop(String str) {
        StringBuilder reverseInput = new StringBuilder(str.length());

        //start from last char and append to reverseInput
        for (int index = str.length() - 1; index >= 0; index--) {
            reverseInput.append(str.charAt(index));
        }
        System.out.println("(For loop) The reverse of " + str + " is: " + reverseInput.toString());
    }

    private static void reverseStringReverse(String str) {
        StringBuilder reverseString = new StringBuilder(str);
        reverseString.reverse();
        System.out.println("(.reverse() The reverse is: " + reverseString.toString());
    }

    private static void getInputAndReverse() {
        Scanner scanner = new Scanner(System.in);
        //ask for input
        System.out.println("Enter a string to be reversed:");
        String input = scanner.nextLine();
        //calling two methods with the same input
        reverseStringForLoop(input);
        reverseStringReverse(input);
        scanner.close();
    }
}

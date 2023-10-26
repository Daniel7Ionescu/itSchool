package session4.challenges;

import java.util.Scanner;

public class Challenge17Auth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasUsername;
        boolean hasPassword;
        String storedUsername = "Tom";
        String storedPassword = "123";

        System.out.println("Enter Username:");
        String userInput = scanner.nextLine();
        hasUsername = authenticateInput(userInput, storedUsername);

        System.out.println("Enter password:");
        userInput = scanner.nextLine();
        hasPassword = authenticateInput(userInput, storedPassword);

        if(hasUsername && hasPassword){
            System.out.println("Authentication successful.");
        } else if(hasUsername && !hasPassword){
            System.out.println("Password is incorrect.");
        } else {
            System.out.println("Authentication failed.");
        }

        scanner.close();
    }

    public static boolean authenticateInput(String inputValue, String storedValue){
        return storedValue.equalsIgnoreCase(inputValue);
    }
}

package session5.challenges;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        printInputSum();
    }

    private static void printInputSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        while(input != -1){
            sum += input;
            printPrompt();
            input = scanner.nextInt();
        }
        System.out.println("The sum in: " + sum);
        scanner.close();
    }

    private static void printPrompt(){
        System.out.println("Enter any number except -1 to be summed up.");
        System.out.println("Enter -1 to stop and see the sum.");
    }
}

package session7.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String input = scanner.nextLine();
//
//        System.out.println(input);

        printSum(scanner);


    }

    public static void printSum(Scanner scanner){
        System.out.println("Enter the first num:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second num:");
        int num2 = scanner.nextInt();
        System.out.println("Sum is: " + (num1 + num2));
    }
}

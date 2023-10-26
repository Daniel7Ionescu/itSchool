package session3.challenges;

import java.util.Scanner;

public class LogicalComplementAndNegationOperators {
    public static void main(String[] args) {
        checkMyInput();
    }

    public static void checkMyInput(){
        Scanner scanner = new Scanner(System.in);
        int option;
        double number;
        boolean input1;
        boolean input2;

        System.out.println("Select an option");
        System.out.println("1. Check positive / negative");
        System.out.println("2. Reverse my bool!");
        option = scanner.nextInt();

        if(option == 1){
            System.out.println("Insert a positive or negative number.");
            number = scanner.nextDouble();
            if(number > 0){
                System.out.println("It's positive");
            } else if(number < 0) {
                System.out.println("It's negative");
            } else {
                System.out.println("It's zero.");
            }
        } else if(option == 2){
            System.out.println("Insert first boolean value");
            input1 = scanner.nextBoolean();
            System.out.println("Insert second boolean value");
            input2 = scanner.nextBoolean();
            System.out.println("The reverse: " + !input1 + " " + !input2);
        } else {
            System.out.println("Invalid input!");
        }
        scanner.close();
    }
}

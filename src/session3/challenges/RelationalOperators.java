package session3.challenges;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        numberChecker();
    }

    public static void numberChecker(){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double minValue;
        double maxValue;
        int option;

        System.out.println("Select an option");
        System.out.println("1. Compare two numbers");
        System.out.println("2. Range checker");
        option = scanner.nextInt();

        //compare two numbers
        if(option == 1){
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            if(num1 > num2) System.out.println("Num1 is greater than num2");
            else if(num1 < 2) System.out.println("Num1 is lesser than num2");
            else System.out.println("Num1 is equal to num2");
        }
        //range checker
        else if(option == 2){
            System.out.println("Setting up the range");
            System.out.println("Enter the min value");
            minValue = scanner.nextDouble();
            System.out.println("Enter the max value");
            maxValue = scanner.nextDouble();
            System.out.println("Enter your number");
            num1 = scanner.nextDouble();

            if(num1 >= minValue && num1 <= maxValue) System.out.println("Number is within the range");
            else if(num1 < minValue) System.out.println("Number is outside the range: LESSER");
            else System.out.println("Number is outside the range: GREATER");
        }
        else System.out.println("Invalid option!");

        scanner.close();
    }
}

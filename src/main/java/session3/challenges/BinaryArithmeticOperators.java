package session3.challenges;
import java.util.Scanner;

public class BinaryArithmeticOperators {

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        int option;

        System.out.println("Welcome user, select an option.");
        System.out.println("1. Basic calculator.");
        System.out.println("2. Rectangle area calculator.");
        option = scanner.nextInt();

        //basic calculator
        if(option == 1){
            System.out.println("===Basic Calculator===");
            System.out.println("Insert first number:");
            num1 = scanner.nextDouble();
            System.out.println("Insert second number:");
            num2 = scanner.nextDouble();

            System.out.println("Select an operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            option = scanner.nextInt();

            if(option == 1) System.out.println(num1 + num2);
            else if(option == 2) System.out.println(num1 - num2);
            else if(option == 3) System.out.println(num1 * num2);
            else if(option == 4) System.out.println(num1 / num2);
            else if(option == 5) System.out.println(num1 % num2);
            else{
                System.out.println("Invalid option, aborted!");
            }
        }
        //area calculator
        else if(option == 2){
            System.out.println("===Rectangle Area Calculator===");
            System.out.println("Insert length:");
            num1 = scanner.nextDouble();
            System.out.println("Insert width:");
            num2 = scanner.nextDouble();
            System.out.println("Rectangle area is: " + num1 * num2);
        }
        //invalid input on option
        else {
            System.out.println("Invalid input, aborted!");
        }

        scanner.close();
    }
}

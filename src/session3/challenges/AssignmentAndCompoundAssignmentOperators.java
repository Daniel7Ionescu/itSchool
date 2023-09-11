package session3.challenges;

import java.util.Scanner;

public class AssignmentAndCompoundAssignmentOperators {
    public static void main(String[] args) {
        //Compound assignment with integers
        int num = 5;
        num += 1;
        System.out.println(num);
        num -= 1;
        System.out.println(num);
        num *= 4;
        System.out.println(num);
        num /= 2;
        System.out.println(num);

        //discount
        discountPrice();
    }

    public static void discountPrice(){
        Scanner scanner = new Scanner(System.in);
        double price;
        double discountPercentage;

        System.out.println("Enter full price: ");
        price = scanner.nextDouble();
        System.out.println("Enter discount percentage:");
        discountPercentage = scanner.nextDouble();
        price -= (price / 100) * discountPercentage;
        System.out.println("Price after discount is: " + price);

        scanner.close();
    }
}

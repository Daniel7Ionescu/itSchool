package session3.challenges;

import java.util.Scanner;

public class UnaryOperators {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(++number);
        System.out.println(++number);
        System.out.println(--number);

        reverseIt();

    }

    public static void reverseIt(){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Reverse it!");
        System.out.println("Insert an int.");
        num = scanner.nextInt();
        System.out.println("It's reversed! " + -num);
        scanner.close();
    }
}



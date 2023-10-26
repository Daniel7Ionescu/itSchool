package session5.challenges;

public class EvenOrOddChecker {

    public static void main(String[] args) {
        printEvenOrOdd(5);
    }

    public static void printEvenOrOdd(int number) {
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }
}

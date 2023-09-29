package session8_wrapppers.challenges;

public class HowManyEvenAndOdd {

    public static void main(String[] args) {
        int[] numbers = {5, 1, 8, 0, 19, 23, 6, 7, 9, 10};
        printEvenAndOddCount(numbers);
    }

    private static void printEvenAndOddCount(int[] array) {
        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount + "\nOdd numbers: " + (array.length - evenCount));
    }
}

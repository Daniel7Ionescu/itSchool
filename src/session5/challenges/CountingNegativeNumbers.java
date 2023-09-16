package session5.challenges;

public class CountingNegativeNumbers {

    public static void main(String[] args) {
        int[] numberArray = {7, -2, 11, 14, -7, -1, 22, -19, 3, 18};
        printNumberOfNegativeIntsForLoop(numberArray);
        printNumberOfNegativeIntsWhile(numberArray);
    }

    public static void printNumberOfNegativeIntsForLoop(int[] array) {
        int counter = 0;

        for (int num : array) {
            if (num < 0) {
                counter++;
            }
        }
        System.out.println("(For loop) Number of negative ints in array is: " + counter);
    }

    public static void printNumberOfNegativeIntsWhile(int[] array) {
        int arrayLimit = 0;
        int counter = 0;

        while (arrayLimit < array.length) {
            if (array[arrayLimit] < 0) {
                counter++;
            }
            arrayLimit++;
        }
        System.out.println("(While) Number of negative ints in array is: " + counter);
    }
}

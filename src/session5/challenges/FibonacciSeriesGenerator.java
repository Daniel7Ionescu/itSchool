package session5.challenges;

public class FibonacciSeriesGenerator {

    public static void main(String[] args) {
        printFirstNNumbersFibonacci(5);
    }

    private static void printFirstNNumbersFibonacci(int number) {
        int counter = 0;
        int currentNumber = 0;
        int nextNumber = 1;
        int sumHolder = 0;

        while (counter <= number) {
            System.out.print(currentNumber + " ");
            sumHolder = currentNumber + nextNumber;
            currentNumber = nextNumber;
            nextNumber = sumHolder;

            counter++;
        }
    }
}

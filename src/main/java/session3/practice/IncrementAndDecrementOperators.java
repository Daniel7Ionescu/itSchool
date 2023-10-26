package session3.practice;

public class IncrementAndDecrementOperators {
    private static int num1 = 5;
    private static int num2 = 5;


    public static void main(String[] args) {
//        System.out.println(num1++);
//        System.out.println(++num2);

        printIncrementedNumbers(2, 7);
    }

    public static void printIncrementedNumbers(int n1, int n2){
        int result1 = n1++ * 5;
        int result2 = ++n2 * 5;
        System.out.println("Result 1: " + result1 + " result 2: " + result2);
    }
}

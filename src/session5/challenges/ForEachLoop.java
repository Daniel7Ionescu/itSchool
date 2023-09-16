package session5.challenges;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] someNumbers = {17, 2, 4, 7, 3, 32};
        printEvenOrOdd(someNumbers);
    }

    private static void printEvenOrOdd(int[] array){
        for(int number : array){
            if(number % 2 == 0){
                System.out.println(number + " Even.");
            } else {
                System.out.println(number + " Odd.");
            }
        }
    }
}

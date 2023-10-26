package session5.challenges;

public class ForLoop {

    public static void main(String[] args) {
        printFirstTenNumbersInFibonacci();
    }

    private static void printFirstTenNumbersInFibonacci(){
        int currentNum = 0;
        int nextNum = 1;
        int sum = 0;
        for(int index = 0; index < 10; index++){
            System.out.print(currentNum + " ");
            sum = currentNum + nextNum;
            currentNum = nextNum;
            nextNum = sum;
        }
    }
}

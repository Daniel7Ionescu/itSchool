package session5.practice;

public class WhilePractice {

    public static void main(String[] args) {
        printNumbers();
        printSumUntilLimit(12);
    }

    public static void printNumbers(){
        int counter = 1;
        while (counter <= 10){
            System.out.println(counter);
            counter++;
        }
    }

    public static void printSumUntilLimit(int limit){
        int number = 1;
        int sum = 0;
        while (number < limit){
            sum += number;
            number++;
        }

        System.out.println(sum);
    }
}

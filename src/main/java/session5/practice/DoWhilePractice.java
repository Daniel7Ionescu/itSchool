package session5.practice;

public class DoWhilePractice {

    public static void main(String[] args) {
        printNumbers();
        printReverseCounter();
    }

    public static void printNumbers(){
        int num = 1;
        do{
            System.out.println("Its running");
            num++;
        }while (num < 5);
    }

    public static void printReverseCounter(){
        int number = 10;
        do{
            System.out.println(number);
            number--;
        } while (number > 0);
    }
}

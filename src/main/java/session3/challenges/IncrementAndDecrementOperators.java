package session3.challenges;
import java.util.Scanner;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        //increment up to 10 then decrement back to 1
        int number = 0;
        while(number < 10){
            number++;
            System.out.println(number);
        }
        while(number > 1){
            number--;
            System.out.println(number);
        }

        //increment / decrement
        incrementDecrement();
    }

    public static void incrementDecrement(){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("==Increment and decrement==");
        System.out.println("Insert an int");
        num = scanner.nextInt();
        num++;
        System.out.println("Num incremented by 1: " + num);
        num--;
        System.out.println("Num decremented by 1: " + num);

        scanner.close();
    }

}

package session8Wrapppers.practice;

import java.util.Random;

public class RandomIntAlg {

    public static void main(String[] args) {
        printRandomNumber();
    }

    public static void printRandomNumber(){
        Random random = new Random();
        int randomNum = random.nextInt(1, 17);
        System.out.println(randomNum);
    }
}

package session7.practice;

import java.util.*;

public class RandomPractice {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(1, 6);

        System.out.println(randomInt);


        String[] fruits = {"apple", "banana", "cherry"};


        for(int index = 0; index < 3; index++){
            String randomFruit = fruits[random.nextInt(fruits.length)];
            System.out.println(randomFruit);
        }

        List<Integer> numbers = Arrays.asList(1,2,3);
        Collections.shuffle(numbers, random);
        System.out.println("Shuffled list: " + numbers);
    }
}

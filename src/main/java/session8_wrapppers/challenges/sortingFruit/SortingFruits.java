package session8_wrapppers.challenges.sortingFruit;

import java.util.*;

public class SortingFruits {

    public static void main(String[] args) {
        String[] fruits = {"Mango", "Banana", "Peach", "Apple", "Pear", "Grapes", "Cherry", "Watermelon"};
        List<String> fruitList = new ArrayList<>();
        populateList(fruits, fruitList);

        Collections.sort(fruitList, new ComparatorLengthAndABC());
        System.out.println(fruitList);
    }

    private static void populateList(String[] sourceArr, List<String> targetArr) {
        for (String item : sourceArr) {
            targetArr.add(item);
        }
    }
}

package session15_equals_hashcode.practice.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsWildcard {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Alice", "Bob");
        List<Integer> integers = Arrays.asList(1,2,3);

        printClassName(integers);
    }

    private static void printClassName(List<?> list){
        System.out.println(list.get(0).getClass().getSimpleName());
    }
}

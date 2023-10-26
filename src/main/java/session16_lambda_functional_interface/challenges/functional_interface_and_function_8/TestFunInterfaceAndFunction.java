package session16_lambda_functional_interface.challenges.functional_interface_and_function_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunInterfaceAndFunction {

    public static void main(String[] args) {
        //starting list of ints
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        //a function that adds 10 to an int
        Function<Integer, Integer> addTenToInt = num -> num + 10;

        //using the function for every element of a list
        IntListModifier intListModifier = (list, function) -> {
            List<Integer> updatedList = new ArrayList<>();
            for (int num : list) {
                updatedList.add(function.apply(num));
            }
            return updatedList;
        };

        System.out.println("Starting list: " + integerList);
        List<Integer> updatedList = intListModifier.modifyList(integerList, addTenToInt);
        System.out.println("Modified list: " + updatedList);
    }
}

package session16_lambda_functional_interface.challenges.generic_fun_interface_11;

import java.util.Arrays;
import java.util.List;

public class TestGenericFunctionalInterface {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Duck", "Horse", "Goose");
        String element = "Duck";

        GenericListProcessor genericListProcessor = (list, item) -> list.contains(item);

        System.out.println("List: " + stringList);
        System.out.println("List contains " + element + ": " + genericListProcessor.isItemInList(stringList, element));
    }
}

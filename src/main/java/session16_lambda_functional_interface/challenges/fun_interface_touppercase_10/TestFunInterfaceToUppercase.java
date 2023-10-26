package session16_lambda_functional_interface.challenges.fun_interface_touppercase_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFunInterfaceToUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Wendy", "Stan", "Kenny");

        StringListUpperProcessor stringListUpperProcessor = list -> listToUpperCase(list);
        System.out.println("List upper cased: " + stringListUpperProcessor.process(names));
    }

    private static List<String> listToUpperCase(List<String> stringList) {
        List<String> list = new ArrayList<>();
        for (String string : stringList) {
            list.add(string.toUpperCase());
        }
        return list;
    }
}

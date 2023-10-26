package session16_lambda_functional_interface.challenges.fun_interface_max_value_from_list_5;

import java.util.Arrays;
import java.util.List;

public class TestMaxValueFromList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(7, 25, 3, 19);

        try {
            MaxValue getMaxValue = list -> getMaxValueFromList(list);
            System.out.println("Max value in list: " + getMaxValue.maxValueFromList(integerList));
        } catch (NullPointerException e){
            System.out.println("-message from try-catch- Provided List is empty.");
        }
    }

    private static Integer getMaxValueFromList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("-message from method- List is empty!");
            return null;
        }
        int max = list.get(0);
        for (int num : list) {
            if (max < num) max = num;
        }
        return max;
    }
}

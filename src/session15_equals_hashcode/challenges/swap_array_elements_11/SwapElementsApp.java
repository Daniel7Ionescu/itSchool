package session15_equals_hashcode.challenges.swap_array_elements_11;

import static session15_equals_hashcode.challenges.swap_array_elements_11.ArrayElementSwapper.*;

public class SwapElementsApp {

    public static void main(String[] args) {
        String[] strArray = {"Red", "Green", "Blue"};
        Integer[] intArray = {1, 2, 3};

        System.out.println("String array started as:");
        printArray(strArray);
        swapElements(strArray, 0, 2);
        System.out.println("String array after swapping: ");
        printArray(strArray);

        System.out.println("Int array started as: ");
        printArray(intArray);
        swapElements(intArray, 0, 2);
        System.out.println("Int array after swap:");
        printArray(intArray);
    }
}

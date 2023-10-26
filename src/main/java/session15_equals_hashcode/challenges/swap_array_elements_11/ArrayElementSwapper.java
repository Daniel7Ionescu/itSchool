package session15_equals_hashcode.challenges.swap_array_elements_11;

public class ArrayElementSwapper {

    public static <T> void swapElements(T[] array, int index1, int index2){
        T holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

package session15_equals_hashcode.practice.generics;

public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Cow");
        System.out.println("From string box: " + stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println("From string box: " + integerBox.getValue());

        Integer[] integers = {1,3,7};
        String[] strings = {"Cow", "goes", "moo"};

        printArray(integers);
        System.out.println();
        printArray(strings);
    }

    private static <E> void printArray(E[] arrray){
        for(E element : arrray){
            System.out.print(element + " ");
        }
    }
}

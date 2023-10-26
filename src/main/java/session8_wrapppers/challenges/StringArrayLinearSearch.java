package session8_wrapppers.challenges;

public class StringArrayLinearSearch {

    public static void main(String[] args) {
        String[] movieTiles = {"Zorro", "Lord of the Rings", "The Matrix", "2Fast 2Furious"};
        System.out.println(getTargetIndex(movieTiles, "The Matrix"));
    }

    private static int getTargetIndex(String[] array, String target) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].equals(target)) {
                return index;
            }
        }
        return -1;
    }
}

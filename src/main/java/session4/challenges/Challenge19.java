package session4.challenges;

public class Challenge19 {

    public static void main(String[] args) {
        // three integer variables, use nested ternary operators to find the largest number
        int a = 11;
        int b = 9;
        int c = 12;

        System.out.println(
                (a > b) ? (a > c) ? a : c
                        : (b > c) ? b : c
        );
    }
}

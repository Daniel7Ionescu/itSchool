package session4.challenges;

public class Challenges11to16 {

    public static void main(String[] args) {
//        11. Addition, multiplication and assignment
        System.out.println("11. Addition, multiplication and assignment");

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int additionResult = a + b;
        int multiplicationResult = c * d;

        System.out.println("Addition " + additionResult);
        System.out.println("Multiplication " + multiplicationResult);

//        12. Change the sign of a number and assign to variable
        System.out.println("12. Change the sign of a number and assign to variable");

        int positiveNumber = 25;
        int negativeNumber = -positiveNumber;

        System.out.println(negativeNumber);

//        13. Logical complement operator to negate the values of booleans
        System.out.println("13. Logical complement operator to negate the values of booleans");

        boolean isRaining = true;
        boolean isSunny = false;

        System.out.println(!isRaining);
        System.out.println(!isSunny);

//        14. Increment and decrement
        System.out.println("14. Increment and decrement");

        int counter = 0;

        counter++;
        System.out.println(counter);

        counter--;
        System.out.println(counter);

//        15. Compound assignment operator
        System.out.println("15. Compound assignment operator");

        int total = 100;

        total -= 20;
        System.out.println(total);

        total *= 2;
        System.out.println(total);

//        16. A series of transformations on an integer variable
        System.out.println("16. A series of transformations on an integer variable");

        int number = 50;

        number = -number;
        System.out.println( "Negate the number: " + number);

        number = -number;
        System.out.println("Absolute value: " + number);

        number++;
        System.out.println("Incremented by 1: " + number);
    }
}

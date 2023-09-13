package session4.challenges;

public class Challenges1to5 {

    public static void main(String[] args) {
//        1. Compare two String objects with the same value
        System.out.println("1. Compare two String objects with the same value");
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        System.out.println(stringOne == stringTwo);

//        2. Equality operator for two ints with any values, .equals for two Strings with the same value
        System.out.println("2. Equality operator for two ints with any values, .equals for two Strings with the same value");
        int firstNumber = 5;
        int secondNumber = 7;

        System.out.println(firstNumber == secondNumber);

        String firstString = "Cow";
        String secondString = "Cow";

        System.out.println("Two string with value 'Cow', are they .equal: " + firstString.equals(secondString));

//        3. Print "I am an adult" if int age is 18 or more, else "I am not an adult"
        System.out.println("3. Print 'I am an adult' if int age is 18 or more, else 'I am not an adult'");
        int age = 21;
        if(age >= 18){
            System.out.println("I am an adult");
        } else {
            System.out.println("I am not an adult");
        }

//        4. Use ternary operator to determine the greater of 2 ints and assign it to a third variable
        System.out.println("4. Use ternary operator to determine the greater of 2 ints and assign it to a third variable");
        int heightOne = 7;
        int heightTwo = 9;
        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println(maximumHeight);

//        5. Print numbers from 1 to 10 using a for loop. Next print only even numbers
        System.out.println("5. Print numbers from 1 to 10 using a for loop. Next print only even numbers");

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }


    }
}

package session4.challenges;

import java.util.ArrayList;

public class Challenges6to10 {

    public static void main(String[] args) {
//        6. Print Hot, Warm or Cold based on temperature value
        System.out.println("6. Print Hot, Warm or Cold based on temperature value");
        int temperature = 25;

        if(temperature > 30){
            System.out.println("Hot");
        } else if(temperature <= 30 && temperature >= 20){
            System.out.println("Warm");
        }else {
            System.out.println("Cold");
        }

//        7. Use ternary operator to determine the type of a triangle based on its sides
        System.out.println("7. Use ternary operator to determine the type of a triangle based on its sides");
        int sideOne = 5;
        int sideTwo = 8;
        int sideThree = 5;

        String triangleType = (sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree) ? "Scalene"
                  : (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" : "Isosceles";

        System.out.println("The triangle is " + triangleType);

//        8. Calculate the factorial of a number using a for loop
        System.out.println("8. Calculate the factorial of a number using a for loop");
        int number = 5;
        printFactorial(number);

//        9. Check if two String are .equal first with the same value, then with different values
        System.out.println("9. Check if two String are .equal first with the same value, then with different values");
        String countryOne = "USA";
        String countryTwo = "USA";

        System.out.println("Both strings have USA value");
        System.out.println(countryOne.equals(countryTwo));

        System.out.println("countryTwo has value UK value");
        System.out.println(countryOne.equals(countryTwo));

//        10. Two ArrayLists
        System.out.println("10. Two ArrayLists");
        ArrayList<String> listOne = new ArrayList<String>();
        ArrayList<String> listTwo = new ArrayList<String>();
        listOne.add("Tom");
        listOne.add("Anna");

        listTwo = listOne;
        listOne.add("Bob");

        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);

    }

    public static void printFactorial(int num){
        //check for positive int
        if(num < 0){
            System.out.println("Error! Need positive int!");
        } else if( num == 0){
            System.out.println("0! is 1");
        }
        //if num is positive
        else {
            int factorialValue = 1;
            int decrementingNum = num;
            while(decrementingNum > 0){
                factorialValue *= decrementingNum;
                decrementingNum--;
            }

            System.out.println(num + "!" + " = " + factorialValue);
        }
    }
}

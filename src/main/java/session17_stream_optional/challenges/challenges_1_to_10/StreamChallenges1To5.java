package session17_stream_optional.challenges.challenges_1_to_10;

import java.util.Arrays;
import java.util.List;

import static session17_stream_optional.challenges.challenges_1_to_10.Session17Util.*;

public class StreamChallenges1To5 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> stringsToConcatenate = Arrays.asList("one", "two", "three", "four");
        List<Person> people = Arrays.asList(
                new Person("Eric", "Cartman", 20),
                new Person("Stan", "Marsh", 17),
                new Person("Wendy", "Testaburger", 23));

        //challenge 1 odd numbers
        List<Integer> evenNumbers = getEvenNumbers(integerList);
        System.out.println("Even numbers list: " + evenNumbers);

        //challenge 2 find and print the longest String
        String longestString = getLongestString(stringList);
        System.out.println("Longest String: " + longestString);

        //challenge 3 stream of numbers from 1 to 100, filter to retain only those numbers which are prime
        List<Integer> primeNumsFromStream = getPrimeNumsInRange(1, 100);
        System.out.println("Prime numbers : " + primeNumsFromStream);

        //challenge 4 concatenate strings from list
        String concatenatedString = getConcatenatedString(stringsToConcatenate);
        System.out.println("Concatenation: " + concatenatedString);

        //challenge 5 find adults (18 or older) in a list of Person
        List<Person> adults = getAdults(people);
        System.out.println("Adults from a list of people: " + adults);
    }
}

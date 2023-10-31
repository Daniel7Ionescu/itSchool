package session17_stream_optional.challenges.challenges_1_to_10;

import java.util.*;

import static session17_stream_optional.challenges.challenges_1_to_10.Session17Util.*;

public class StreamChallenges6To10 {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        List<String> stringsToLength = Arrays.asList("Hello", "World", "Java", "Streams");
        String sentence = "Hello World";
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        List<String> stringsChallenge10 = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        //challenge 6 reduce int array
        Integer sumFromArray = getSumFromArray(numbers);
        System.out.println("Sum of array numbers with reduce: " + sumFromArray);

        //challenge 7 list of strings to list of strings length
        List<Integer> stringsLength = getStringsLength(stringsToLength);
        System.out.println("Strings lengths: " + stringsLength);

        //challenge 8 count the vowels in a string
        int numOfVowelsInString = getNumberOfVowels(sentence);
        System.out.println("Number of vowels in " + sentence + " : " + numOfVowelsInString);

        //challenge 9 flatMap to create a list of all words in all the sentences, find the most frequently occurring word.
        //a mix of stream and loops
        List<String> frequentWord = getFrequentWordInList(sentences);
        System.out.println("Frequent word: " + frequentWord);
        //full stream implementation
        printFrequentWord(sentences);

        //challenge 10 find the total number of characters across a list of strings excluding whitespace characters.
        int numberOfCharacters = getNumOfCharsNoWhitespace(stringsChallenge10);
        System.out.println("Number of characters: " + numberOfCharacters);
    }
}

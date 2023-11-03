package session18_recap.challenges.process_input_sentence_13;

import java.util.Arrays;
import java.util.Locale;

public class ProcessInputStringApp {

    public static void main(String[] args) {
        //Problem 13
        //Given an input string with words separated by spaces, write a method to split the string into words
        // and store them in an array.
        // Then, using streams, filter out words of length less than 4 and return an array of the remaining words in uppercase.

        String inputString = "My little cow goes moo on the hill every night";

        String[] processedInputString = Arrays.stream(inputString.split(" "))
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .toArray(String[]::new);

        for(String word : processedInputString){
            System.out.println(word);
        }
    }
}

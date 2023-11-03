package session18_recap.challenges.reverse_sentence_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = "dog goes bark and duck goes quack";

        //Collections reverse
        List<String> wordList = new ArrayList<>(List.of(sentence.split(" ")));
        Collections.reverse(wordList);
        System.out.printf("With Collections.reverse(): %s%n", wordList);

        //Collections reverse and string builder
        String reversed = reverseSentenceWithStringbuilder(sentence);
        System.out.println(reversed);
    }

    private static String reverseSentenceWithStringbuilder(String sentence) {
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.reverse(wordList);

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordList) {
            stringBuilder.append(word).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}

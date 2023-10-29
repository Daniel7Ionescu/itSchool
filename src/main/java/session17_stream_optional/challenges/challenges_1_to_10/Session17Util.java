package session17_stream_optional.challenges.challenges_1_to_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Session17Util {

    static int getNumOfCharsNoWhitespace(List<String> stringList) {
        return stringList.stream()
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .map(String::length)
                .reduce(0, (acc, value) -> acc + value);
    }

    static List<String> getFrequentWordInList(List<String> stringList) {
        //flatten
        List<String> words = stringList.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .toList();

        //put in map with a counter
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        //looking for the most frequent word
        Map.Entry<String, Integer> mostFreq = null;
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (mostFreq == null || entry.getValue().compareTo(mostFreq.getValue()) > 0) {
                mostFreq = entry;
            }
        }

        //check is other words are as frequent, add most freq word or words
        List<String> freqWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (!entry.getKey().equals(mostFreq) && entry.getValue() == mostFreq.getValue()) {
                freqWords.add(entry.getKey());
            }
        }
        //maybe some formatting
        return freqWords;
    }

    static int getNumberOfVowels(String string) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        return (int) Arrays.stream(string.split(""))
                .filter(vowels::contains)
                .count();
    }

    static List<Integer> getStringsLength(List<String> stringList) {
        return stringList.stream()
                .map(String::length)
                .toList();
    }

    static int getSumFromArray(Integer[] integers) {
        return Arrays.stream(integers).reduce(0, (acc, val) -> acc + val);
    }

    static List<Person> getAdults(List<Person> personList) {
        return personList.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) return false;
        }
        return true;
    }

    static String getConcatenatedString(List<String> stringsToConcatenate) {
        return stringsToConcatenate.stream()
                .map(string -> string + ",")
                .collect(Collectors.joining());
    }

    static List<Integer> getPrimeNumsInRange(int min, int max) {
        return IntStream.rangeClosed(min, max)
                .filter(Session17Util::isPrime)
                .boxed()
                .toList();
    }

    static String getLongestString(List<String> stringList) {
        return stringList.stream()
                .max(Comparator.comparing(String::length))
                .get();
    }

    static List<Integer> getEvenNumbers(List<Integer> integerList) {
        return integerList.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }
}

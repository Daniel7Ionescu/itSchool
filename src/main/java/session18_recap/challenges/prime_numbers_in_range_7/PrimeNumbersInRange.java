package session18_recap.challenges.prime_numbers_in_range_7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersInRange {

    public static void main(String[] args) {
        //Problem 7
        //Use Java streams to generate a list of the first 10 prime numbers greater than 100.

        //approach 1 using loops
        List<Integer> primesFromLoop = getNPrimeNumbersGreaterThanUsingLoops(100, 10);
        System.out.printf("First 10 Primes greater than 100, from loop: %s%n", primesFromLoop);

        //approach 2 using streams
        int greaterThan = 100;
        int upTo = 200;
        int n = 10;
        List<Integer> primesFromStream = getNPrimeNumbersGreaterThan(greaterThan, upTo, n);
        System.out.printf("First %d Primes greater than %d, up to %d from stream: %s", n, greaterThan, upTo, primesFromStream);

    }

    private static List<Integer> getNPrimeNumbersGreaterThan(int greaterThan, int upTo, int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        IntStream.range(greaterThan, upTo)
                .filter(num -> isPrime(num))
                .limit(n)
                .forEach(primeNumbers::add);
        return primeNumbers;
    }

    private static List<Integer> getNPrimeNumbersGreaterThanUsingLoops(int greaterThan, int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int num = greaterThan; primeNumbers.size() < n; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) return false;
        }
        return true;
    }
}
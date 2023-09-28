package session8Wrapppers.challenges.sortingFruit;

import java.util.Comparator;

public class ComparatorLengthAndABC implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        //check length
        if (str1.length() != str2.length()) {
            return str1.length() - str2.length();
        }
        //else check the "word" itself
        else {
            return str1.compareTo(str2);
        }
    }
}

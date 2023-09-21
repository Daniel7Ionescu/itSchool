package session6CoreApi.challenges;

public class FrequencyCounter {

    public static void main(String[] args) {
        String str = "itSchool";

        System.out.println("V1 comparing chars, counting and marking " + str + ":");
        System.out.println(charCounter(str));
        System.out.println("V2 counting ASCII value " + str + ":");
        System.out.println(countCharsASCIIValue(str));
    }

    //compare chars, count and mark duplicates
    private static String charCounter(String input) {
        StringBuilder updatedString = new StringBuilder();
        char[] charArr = input.toCharArray();
        int[] charCount = new int[charArr.length];

        //counting the chars
        for (int inputIndex = 0; inputIndex < input.length(); inputIndex++) {
            //starter char and chars that had no duplicates until this inputIndex get a 1
            charCount[inputIndex] = 1;
            //compare current char with the rest inside the char array, so duplicates can be counted and marked
            for (int nextIndex = inputIndex + 1; nextIndex < input.length(); nextIndex++) {
                if (charArr[inputIndex] == charArr[nextIndex]) {
                    charCount[inputIndex]++;
                    charArr[nextIndex] = '*';
                }
            }
        }

        //add chars and their count to the String
        for (int index = 0; index < charCount.length; index++) {
            if (charArr[index] != '*') {
                updatedString.append(charArr[index] + ": " + charCount[index] + "\n");
            }
        }
        return updatedString.toString();
    }

    //use ASCII value and increment it
    private static String countCharsASCIIValue(String input) {
        StringBuilder updatedString = new StringBuilder();
        //array to cover all ASCII values
        int[] charCount = new int[256];

        //counting each char
        for (int index = 0; index < input.length(); index++) {
            //cast char to int gives ASCII value
            charCount[(int) input.charAt(index)]++;
        }

        //adding to String
        for (int index = 0; index < charCount.length; index++) {
            if (charCount[index] != 0) {
                //cast int to char to get the letter
                updatedString.append((char) index + ": " + charCount[index] + "\n");
            }
        }
        return updatedString.toString();
    }
}
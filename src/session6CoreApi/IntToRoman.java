package session6CoreApi;

public class IntToRoman {

    public static void main(String[] args) {
        //can go up to 3999, after it requires special roman characters
        int number = 24;
        System.out.println("The number " + number + " in roman numerals: " + intToRoman(number));
    }

    public static String intToRoman(int num) {
        String romanNumber = "";
        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length(); i++){
            int number = Character.getNumericValue(strNum.charAt(i));
            int howManyZeroes = strNum.length() - 1 - i;
            romanNumber += numToRoman(number, howManyZeroes);
        }
        return romanNumber;
    }

    public static String numToRoman(int num, int zeroes){
        String result = "";
        int multiplyBy = 1;
        int myNumber;

        //values to compare to and assign
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] majorNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        while(zeroes > 0){
            zeroes--;
            multiplyBy *= 10;
        }

        myNumber = num * multiplyBy;
        //assign roman to number;
        for(int i = 0; i < majorNumbers.length; i++){
            while(myNumber >= majorNumbers[i]){
                myNumber -= majorNumbers[i];
                result += romanNumbers[i];
            }
        }
        return result;
    }
}
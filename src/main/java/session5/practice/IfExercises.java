package session5.practice;

public class IfExercises {

    public static void main(String[] args) {
        int number = 5;
        int numToCompare = 12;
        printNumberComparisonInfo(number, numToCompare);
        printNumberComparisonInfoV2(24);
    }

    private static void printNumberComparisonInfo(int number, int numToCompare) {
        if (number > numToCompare) {
            System.out.println("The number is greater than " + numToCompare);
        } else if (number < numToCompare) {
            System.out.println("The number is lesser than " + numToCompare);
        } else {
            System.out.println("The number is equal to " + numToCompare);
        }
    }

    private static void printNumberComparisonInfoV2(int number){
        if(number >= 0 && number <= 50){
            System.out.println("The number if between 0 and 50");
        } else if(number >= 51 && number <= 100){
            System.out.println("The number is between 51 and 100");
        } else {
            System.out.println("The number is out of range");
        }
    }
}

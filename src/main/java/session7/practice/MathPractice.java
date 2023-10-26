package session7.practice;

public class MathPractice {

    public static void main(String[] args) {
        double firstNum = 2.4;
        double secondNum = 5.7;

        double maxValue = Math.max(firstNum, secondNum);
        System.out.println("Max value: " + maxValue);
        System.out.println("Max value rounded: " + Math.round(maxValue));

        double minValue = Math.min(firstNum, secondNum);
        System.out.println("Min value: " + minValue);


    }
}

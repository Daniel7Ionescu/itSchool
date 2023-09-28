package session8Wrapppers.challenges;

import java.text.DecimalFormat;

public class BinaryStringToDecimalValue {

    public static void main(String[] args) {
        String binaryNum = "1011";
        System.out.println("From: " + binaryNum + " to: " + stringBinaryToNum(binaryNum));
    }

    private static int stringBinaryToNum(String str){
        int num = Integer.parseInt(str, 2);
        return num;
    }
}


package katas.stage1;
//Given an integer x, return true if x is a palindrome and false otherwise.
//input x = 121
public class PalindromeNumber {
    public static void main(String[] args){
        PalindromeSolution pal = new PalindromeSolution();

        System.out.println(pal.isPalindrome(121));
    }
}
class PalindromeSolution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reverseNum = 0;
        int lastDigit;
        while(x > 0){
            lastDigit = x % 10;
            x = x / 10;
            reverseNum = reverseNum * 10 + lastDigit;
        }

        if(originalNum == reverseNum){
            return true;
        } else {
            return false;
        }
    }
}

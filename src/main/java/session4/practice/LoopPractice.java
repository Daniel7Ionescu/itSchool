package session4.practice;

public class LoopPractice {

    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }

        int[] numArr = {2,3,4,5};

        printArray(numArr);

        printEvenNumsUpTo(11);
    }

    public static void printArray(int[] nums){
        for(int num : nums){
            System.out.println(num);
        }
    }

    public static void printEvenNumsUpTo(int limitValue){
        for(int i = 0; i <= limitValue; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}

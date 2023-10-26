package session8_wrapppers.practice;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 5, 9, 14, 26};
        Arrays.sort(nums);
        int target = 7;

        int result = binarySearch(nums, target);
        if(result != -1){
            System.out.println("Result: " + result);
        }else {
            System.out.println("Result not found");
        }
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while ( left <= right){
            int middle = left + (right - left) / 2;
            if(arr[middle] == target){
                return middle;
            } else if(arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}

package katas.stage1;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
public class TwoSum {
   public static void main(String[] args){
       Solution twoSumSolution = new Solution();
       int[] nums = {2,7,11,15};
       int[] result = twoSumSolution.twoSum(nums, 9);

       for(int i = 0; i < result.length; i++){
           System.out.println(result[i]);
       }
   }
}

 class Solution{
     public int[] twoSum(int[] nums, int target) {
         int[] result = new int[2];

         for (int i = 0; i < nums.length - 1; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] + nums[j] == target) {
                     result[0] = i;
                     result[1] = j;
                     return result;
                 }
             }
         }
         return result;
     }
}

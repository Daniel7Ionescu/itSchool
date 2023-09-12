package katas.stage1;
//sort array - first elements != target value
//count elements != value and return the count

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int numsNotEqualToValue = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[numsNotEqualToValue] = nums[i];
                numsNotEqualToValue++;
            }
        }
        return numsNotEqualToValue;
    }
}

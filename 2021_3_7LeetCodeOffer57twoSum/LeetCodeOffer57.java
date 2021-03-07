package Code2021_3_7;

import java.util.Arrays;

public class LeetCodeOffer57 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] ret = twoSum(nums,target);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] array = new int [2];
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                array[0] = nums[left];
                array[1] = nums[right];
                break;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return array;
    }
}

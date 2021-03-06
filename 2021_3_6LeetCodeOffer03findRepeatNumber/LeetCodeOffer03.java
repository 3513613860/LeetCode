package Code2021_3_6;

import java.util.Arrays;

public class LeetCodeOffer03 {
    public static void main(String[] args) {
        int [] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    public static  int findRepeatNumber(int[] nums) {
        //排序
        Arrays.sort(nums);
        //遍历，查找重复的数字
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}

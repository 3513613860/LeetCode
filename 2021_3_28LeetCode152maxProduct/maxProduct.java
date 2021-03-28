class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length <= 1){
            return nums[0];
        }
        int max  = 0;
        for(int i = 0; i < nums.length - 1; i++){
            int ret = nums[i];

            if(ret > max){
                max = ret;
            }            
            for(int j = i + 1; j < nums.length; j++){
                ret = ret * nums[j];
                if(ret > max){
                    max = ret;
                }
            }
        }
        return max > nums[nums.length - 1]?max:nums[nums.length - 1];
    }
}
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int cur = nums[left]+nums[right];
            if(cur > max){
                max = cur;
            }
            left++;
            right--;
        }
        return max;
    }
}
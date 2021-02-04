class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int m = nums.length;
        int count = 0;
        for(int i = 0; i < m; i++){
            if(nums[i] == nums[m/2]){
                count++;
            }
        }

        if(count > m/2){
            return nums[m/2];
        }else{
            return -1;
        }
    }
}
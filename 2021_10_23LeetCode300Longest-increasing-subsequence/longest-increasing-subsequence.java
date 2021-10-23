class Solution {
    public int lengthOfLIS(int[] nums) {
        //1.定义状态数组，dp[i]为已dp[i]为末尾的最长递增子数组的长度
        int[] dp = new int[nums.length];
        //2.数组初始化，所有元素赋值为1
        Arrays.fill(dp,1);

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                //3.如果nums[i]>nums[j]，dp[i]为dp[i],dp[j]+1两个中的最大值
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        //4.去dp数组中的最大值
        Arrays.sort(dp);
        return dp[nums.length-1];
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        //1.等差数列的求和公式
        // int n = nums.length;
        // int sum = n*(1+n)/2;
        // int sum2=0;
        // for(int i = 0; i < nums.length; i++){
        //     sum2 += nums[i];
        // }
        // return sum-sum2;

        //2.使用位运算
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            n = n ^(i ^ nums[i]);
        }
        return n^nums.length;
    }
}
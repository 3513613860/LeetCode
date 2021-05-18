class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
         
        int j = nums.length-k;
        int temp = k;
        for(int i = 1; i <= j; i++){
            if(sum > max){
                max = sum;
            }
            sum -= nums[i-1];
            sum += nums[temp++];

        }
        if(sum > max){
             max = sum;
         }
        return max/k;
    }
}
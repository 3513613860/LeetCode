class Solution {
    public int cuttingRope(int n) {
        int [] nums = new int [n+1];
        nums[2] = 1;
        for(int i = 3; i <= n; i++){
            int max = i-1;
            for(int j = 2; j <= i/2; j++){
                int k = i - j;
                int a = j > nums[j] ? j : nums[j];
                int b = k > nums[k] ? k : nums[k];
                max = Math.max(max,a*b);
            }
            nums[i] = max;
        }

        return nums[n];
    }
}
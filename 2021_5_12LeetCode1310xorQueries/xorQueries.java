class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] nums = new int [queries.length];
        for(int i = 0; i < queries.length; i++){
            int ret = 0;
            int j = queries[i][0];
            int k = queries[i][1];

            for(;j <= k; j++){
                ret ^= arr[j];
            }
            nums[i] = ret;
        }

        return nums;
    }
}
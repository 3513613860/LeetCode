class Solution {
    public int[] sumZero(int n) {
        int [] nums = new int [n];
        if(n == 1){
            nums[0] = 0;
            return nums;
        }

        int k = n /2 *(-1);
        for(int i = 0; i < n; i++){
            nums[i] = k++;
        }
        if(n % 2 == 0){
            nums[n/2] = n/2;
        }
        
        return nums;
    }
}
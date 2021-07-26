class Solution {
    public int binaryGap(int n) {
        int [] nums = new int [32];
        int k = 0;
        //1.记算出每一位
        for(int i = 0; i < 32; i++){
            nums[i] = (n >> i) & 1;
            if(nums[i] == 1){
                k++;
            }
        }

        //2.把位为1的放入array数组中
        int [] array = new int [k];
        int t = 0;
        for(int i = 31; i >= 0; i--){
            if(nums[i] == 1){
                array[t++] = i;
            }
        }

        //3.求出最大值
        int max = 0;
        for(int i = 1; i < k; i++){
            max = Math.max(max,array[i-1]-array[i]);
        }
        return max;
    }
}
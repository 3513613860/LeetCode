class Solution {
    public int numTrees(int n) {
        //使用动态规划的思想进行计算
        int [] nums = new int [n+1];
        //初始化nums[0]和nums[1]
        nums[0] = 1;
        nums[1] = 1;

        //外层循环控制有多少个n
        for(int i = 2; i < n+1; i++){
            int k = i-1;
            int t = k;
            int sum = 0;
            //内层循环：比如n为5
            //nums[0]*nums[4]+nums[1]*nums[3]+nums[2]*nums[2]+
            //nums[3]+nums[1]+nums[4]*nums[0]
            //根节点为1，左子树为空，右子树为4个结点的排列
            //根节点为2，左子树为1个结点的排列，右子树为3个结点的排列
            //依次类推
            for(int j = 0; j <= k; j++,t--){
                sum += nums[j]*nums[t];
            }
            nums[i] = sum;
        }

        return nums[n];
    }
}
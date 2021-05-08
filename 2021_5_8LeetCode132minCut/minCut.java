class Solution {
    public int minCut(String s) {
        /*
          1.状态：F（i）为前i个字符能够分隔的最小次数
          2.状态转移方程：nums[i] = Math.min(nums[i],nums[j]+1)
          3.初始化：nums[i]初始化为i-1
          4.返回：返回nums[n]          
        */
        int n = s.length();
        //开辟n+1个长度的空间
        int [] nums = new int [n+1];
        
        //初始化一维数组
        for(int i = 0; i < nums.length; i++){
            nums[i] = i-1;
        }

    
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                if(isPalin(s,j,i-1)){
                    nums[i] = Math.min(nums[i],nums[j]+1);
                }
            }
        }

        return nums[n];
    }

    //判断字符串是否是回文字符串
    public boolean isPalin(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
class Solution {
    public int maxPower(String s) {
        //将字符串转换为字符数组
        char [] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        int max = 1;
        //遍历字符数组
        while(i < n){
            int len = 1;
            //如果相同，计算相同的个数
            while(i < n-1 && arr[i] == arr[i+1]){
                len++;
                i++;
            }
            //max用来记录最大的相同个数
            if(max < len){
                max = len;
            }
            i++;            
        }
        return max;
    }
}
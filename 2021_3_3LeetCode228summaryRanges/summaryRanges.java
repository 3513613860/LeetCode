class Solution {
    public List<String> summaryRanges(int[] nums) {
        //创建ArrayList对象
        List<String> list = new ArrayList<>();
        //遍历数组
        for(int i = 0; i < nums.length; i++){
            int k = 0;
            //统计连续的区间
            while(i < nums.length - 1 && nums[i] == nums[i+1]-1){
                k++;
                i++;
            }
            //k 大于0,至少有两个,k等于0,说明只有一个
            if(k > 0){
                list.add(Integer.toString(nums[i-k])+"->"+
                Integer.toString(nums[i]));
            }else{
                list.add(Integer.toString(nums[i]));
            }
        }
        return list;
    }
}
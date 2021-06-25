class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        back(candidates,target,0,0);
        return list;
    }

    public void  back(int [] candidates,int target,int low,int curSum){
        //curSum大于目标值，直接返回
        if(curSum > target){
            return;
        }

        //curSum等于target时，保存到list当中，然后再返回
        if(curSum == target){
            list.add(new ArrayList(subList));
            return;
        }

        //for循环控制每一层级的长度
        for(int i = low; i < candidates.length; i++){
            subList.add(candidates[i]);
            //curSum += candidates[i];
            //back往叶子节点走
            back(candidates,target,i,curSum+candidates[i]);
            //curSum -= candidates[i];            
            subList.remove(subList.size()-1);
        }
    }
}
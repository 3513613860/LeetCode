class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(candidates,target,0,0);
        return list;
    }

    public void back(int [] candidates,int target,int index,int curSum){
        if(curSum > target){
            return;
        }

        if(curSum == target && !set.contains(subList)){
            set.add(new ArrayList(subList));
            list.add(new ArrayList(subList));
            return;
        }

        for(int i = index; i< candidates.length; i++){
            subList.add(candidates[i]);
            back(candidates,target,i+1,curSum+candidates[i]);
            subList.remove(subList.size()-1);
        }
    }
}
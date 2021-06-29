class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean [] used = new boolean[nums.length];
        back(nums,used);
        return list;
    }

    public void back(int [] nums,boolean [] used){
        if(subList.size() == nums.length){
            list.add(new ArrayList(subList));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i] == true){
                continue;
            }
            used[i] = true;
            subList.add(nums[i]);
            back(nums,used);
            used[i] = false;
            subList.remove(subList.size()-1);
        }
    }
}
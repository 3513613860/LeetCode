class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++){
            int size = list.size();
            for(int j = 0; j < size; j++){
                List<Integer> subList = new ArrayList<>(list.get(j));
                subList.add(nums[i]);
                if(!set.contains(subList)){
                    set.add(subList);
                    list.add(subList);
                }
            }
        }
        return list;
    }
}
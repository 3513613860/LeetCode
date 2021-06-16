class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int k = map.get(arr[i]);
                map.put(arr[i], k + 1);
            }
        }

        Set<Map.Entry<Integer,Integer>> set2 = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : set2){
            int k = entry.getValue();
            if(!set.contains(k)){
                set.add(k);
            }else{
                return false;
            }            
        }
        return true;
    }
}
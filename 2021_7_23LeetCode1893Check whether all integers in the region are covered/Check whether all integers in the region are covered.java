class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < ranges.length; i++){
            int low = ranges[i][0];
            int high = ranges[i][1];
            for(int j = low; j <= high; j++){
                set.add(j);
            }
        }

        for(int i = left; i <= right; i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}
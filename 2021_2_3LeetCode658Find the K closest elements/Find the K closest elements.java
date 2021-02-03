class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        if (arr.length == 0) return res;
        int l = 0;
        int r = arr.length;
        //采用二分查找找到符合条件的l，r，之间差距为1
        while (r - l > 1) {
            int mid = (l + r)/2;
            if (arr[mid] == x) {
                l = mid;
                r = mid + 1;
            } else if (arr[mid] > x) {
                r = mid;
            }else{
                l = mid;
            }
        }
        while (k > 0) {
            if (l < 0) {
                r++;
            } else if (r >= arr.length) {
                l--;
            } else {
                if (arr[r] - x < x - arr[l]) {
                    r++;
                } else {
                    l--;
                }
            }
            k--;
        }
        for (int i = l + 1; i < r; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
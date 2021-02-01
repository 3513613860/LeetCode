class Solution {
    public int compareVersion(String version1, String version2) {
        String [] arr1 = version1.split("\\.");
        String [] arr2 = version2.split("\\.");
        int m = arr1.length;
        int n = arr2.length;
        int j = 0;
        int k = 0;
        for(int i = 0; i < Math.max(m,n);i++){
            if(i < m){
                 j = Integer.valueOf(arr1[i]);
            }else{
                j = 0;
            }
            if(i < n){
                 k = Integer.valueOf(arr2[i]);
            }else{
                k = 0;
            }
            if(j > k){
                return 1;
            }
            if(j < k){
                return -1;
            }
        }
        return 0;
    }
}
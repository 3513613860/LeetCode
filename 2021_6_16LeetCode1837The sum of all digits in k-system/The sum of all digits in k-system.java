class Solution {
    public int sumBase(int n, int k) {
        String s = "";
        while(n > 0){
            int yu = n % k;
            s = yu +s;
            n = n / k;
        }

        int ret = 0;
        for(int i = 0; i < s.length(); i++){
            ret = ret + s.charAt(i) - 48;
        }

        return ret;
    }
}
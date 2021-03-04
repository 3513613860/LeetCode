class Solution {
    public int titleToNumber(String s) {
        char [] array = s.toCharArray();
        int m = 0;
        int j = 0;
        for(int i = array.length - 1; i >= 0; i--){
            m = m + (int)Math.pow(26,j++) * (s.charAt(i) - 64);
        }
        return m;
    }
}
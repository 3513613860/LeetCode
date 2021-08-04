class Solution {
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        while(low < high){
            if(s.charAt(low) == s.charAt(high)){
                low++;
                high--;
            }else{
                return validPalindrome(s,low+1,high) ||
                validPalindrome(s,low,high-1);
            }
        }
        return true;
    }

    public boolean validPalindrome(String s,int low,int high){
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}
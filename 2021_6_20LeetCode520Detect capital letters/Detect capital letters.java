class Solution {
    public boolean detectCapitalUse(String word) {
        char [] chars = word.toCharArray();
        
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 65 && chars[i] <= 90){
                count++;
            }
        }

        if(count == 0 || count == chars.length ||(count == 1 
            && chars[0]  >= 65 && chars[0] <= 90)){
            return true;
        }else{
            return false;
        }
    }
}
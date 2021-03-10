class Solution {
    public String reverseLeftWords(String s, int n) {
        char [] chars = s.toCharArray();
        int m = chars.length - 1;
        reverse(chars,0,n-1);
        reverse(chars,n,m);
        reverse(chars,0,m);
        return new String(chars);
    }

    public void reverse(char [] chars,int i, int j){
        while(i < j){
            char ch = chars[i];
            chars[i] = chars[j];
            chars[j] = ch;
            i++;
            j--;
        }
    }
}
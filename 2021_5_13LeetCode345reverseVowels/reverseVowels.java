class Solution {
    public String reverseVowels(String s) {
        char [] chars = s.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        while(i < j){
            while(i < j && !set.contains(s.charAt(i))){
                i++;
            }

            while(i < j && !set.contains(s.charAt(j))){
                j--;
            } 

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;           
        }
        return new String(chars);
    }
}
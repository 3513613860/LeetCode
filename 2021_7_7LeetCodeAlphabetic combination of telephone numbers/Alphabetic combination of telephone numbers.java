class Solution {
    List<String> list = new ArrayList<>();    
    public List<String> letterCombinations(String digits) {
 
        String [] strings = {"","","abc","def","ghi","jkl","mno",
                "pqrs","tuv","wxyz"};
        if(digits.length() == 0){
            return list;
        }

        StringBuilder sb = new StringBuilder();
        back(strings,digits,sb,0);
        return list;
    }

    public void back(String [] strings, String digits,
            StringBuilder sb,int num){
        if(sb.toString().length() == digits.length()){
            list.add(sb.toString());
            return;
        }

        String str = strings[digits.charAt(num)-'0'];
        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            back(strings,digits,sb,num+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
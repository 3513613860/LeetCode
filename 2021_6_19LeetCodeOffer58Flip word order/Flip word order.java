class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strings.length; i++){
            if(!strings[i].trim().equals("")){
                list.add(strings[i]);
            }
        }

        for(int i = list.size()-1; i >= 0; i--){
            if(i != 0){
                sb.append(list.get(i)+" ");
            }else{
                sb.append(list.get(i));
            }
        }
        
        return sb.toString();
    }
}
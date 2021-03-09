class Solution {
    public String removeDuplicates(String S) {
        //创建栈对象
        Stack<Character> stack = new Stack<>();
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        stack.push(S.charAt(0));
        //遍历字符串
        for(int i = 1; i < S.length(); i++){
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)){
                stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }
        //栈不为空，出栈
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        //先反转，再转字符串
        return sb.reverse().toString();
    }
}
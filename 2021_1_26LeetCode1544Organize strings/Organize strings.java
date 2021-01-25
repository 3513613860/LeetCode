class Solution {
    public String makeGood(String s) {
        //如果为空，直接返回空
        if(s == ""){
            return null;
        }
        Stack<Character> stack = new Stack<>();
        //遍历字符，如果栈顶字符和当前字符存在相同大小写，则出栈，否则入栈
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }else if(stack.peek() == ch + 32 || stack.peek()+32 ==  ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        //定义一个字符串接受
        StringBuilder str = new StringBuilder("");
        //取出栈里面的字符，然后拼接
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        //进行反转，然后转为由StringBuilder转换为String
        return str.reverse().toString();
    }
}
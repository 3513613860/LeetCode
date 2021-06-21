class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;

        while(i < pushed.length){
            if(stack.isEmpty() || stack.peek() != popped[j]){
                stack.push(pushed[i++]);
            }

            while(!stack.isEmpty() && stack.peek() ==popped[j]){
                stack.pop();
                j++;
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
class MinStack {

    Stack<Integer>stack1 = new Stack<>();
    Stack<Integer>stack2 = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }
    //任何元素都入栈1，不用进行判断；栈2为空时，直接入栈，不为空时，判断当前元素x是否小于等于栈顶元素
    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()){
            stack2.push(x);
        }else{
            if(x <= stack2.peek()){
                stack2.push(x);
            }
        }
    }
    //栈1进行出栈，判断出栈元素是否等于栈2栈顶元素，如果等于，栈2也出栈
    public void pop() {
        int a = stack1.pop();
        if(a==stack2.peek()){
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    //最小值即为栈2栈顶元素
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
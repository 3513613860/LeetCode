class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }
    
    //栈1全部入栈，栈2：为空直接进入，不为空时判断当前元素是否小于等于栈2栈顶元素，如果小于，则x进行入栈
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
    
    //出栈时，栈1栈顶元素如果等于栈2栈顶元素，则同时出栈
    public void pop() {
        int a = stack1.pop();
        if(a == stack2.peek()){
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();       
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
class MyCircularQueue {
    //front指向队首，rear指向队尾的下一个元素，arr用来存放元素
    int front;
    int rear;
    int [] arr;
    
    public MyCircularQueue(int k) {
        front = 0;
        rear = 0;
        arr = new int[k+1];//题目要求为长度为k时，放k个元素，所以这里开辟k+1个长度
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arr[rear] = value;
        rear = (rear+1)%arr.length;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%arr.length;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(rear-1+arr.length)%arr.length];
    }
    
    public boolean isEmpty() {
        if(front == rear){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull() {
        if((rear+1)%arr.length==front){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
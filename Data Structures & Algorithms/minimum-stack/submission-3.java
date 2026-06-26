class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> sMin;

    public MinStack() {
        s = new Stack<>();
        sMin = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(sMin.isEmpty() || val <= sMin.peek()){
            sMin.push(val);
        }
        
    }
    
    public void pop() {
        if(s.isEmpty()) return;
        int top = s.pop();
        if(top == sMin.peek()){
            sMin.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return sMin.peek();
    }
}

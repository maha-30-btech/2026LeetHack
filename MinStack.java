import java.util.Stack;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty()) {
            minSt.push(val);
        } else {
            if (val <= minSt.peek()) {
                minSt.push(val);
            }
        }
    } 
    
    public void pop() {
        if (st.isEmpty()) return; 

        if (minSt.peek().equals(st.peek())) {
            minSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
} 

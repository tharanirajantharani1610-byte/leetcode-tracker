// Last updated: 29/07/2026, 15:08:26
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class MinStack {
5    private Deque<Integer> stack;
6    private Deque<Integer> minStack;
7
8    public MinStack() {
9        stack = new ArrayDeque<>();
10        minStack = new ArrayDeque<>();
11    }
12    
13    public void push(int val) {
14        stack.push(val);
15    
16        if (minStack.isEmpty() || val <= minStack.peek()) {
17            minStack.push(val);
18        }
19    }
20    
21    public void pop() {
22        int popped = stack.pop();
23         
24        if (popped == minStack.peek()) {
25            minStack.pop();
26        }
27    }
28    
29    public int top() {
30        return stack.peek();
31    }
32    
33    public int getMin() {
34        return minStack.peek();
35    }
36}
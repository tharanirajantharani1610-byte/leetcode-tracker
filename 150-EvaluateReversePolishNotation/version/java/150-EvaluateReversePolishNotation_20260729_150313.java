// Last updated: 29/07/2026, 15:03:13
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public int evalRPN(String[] tokens) {
6        Deque<Integer> stack = new ArrayDeque<>();
7
8        for (String token : tokens) {
9            switch (token) {
10                case "+":
11                    stack.push(stack.pop() + stack.pop());
12                    break;
13
14                case "-":
15                    int bMinus = stack.pop();
16                    int aMinus = stack.pop();
17                    stack.push(aMinus - bMinus);
18                    break;
19
20                case "*":
21                    stack.push(stack.pop() * stack.pop());
22                    break;
23
24                case "/":
25                    int bDiv = stack.pop();
26                    int aDiv = stack.pop();
27                    stack.push(aDiv / bDiv);
28                    break;
29
30                default:
31                     stack.push(Integer.parseInt(token));
32                    break;
33            }
34        }
35
36        return stack.pop();
37    }
38}
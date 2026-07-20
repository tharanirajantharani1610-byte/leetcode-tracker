// Last updated: 20/07/2026, 16:10:25
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public int longestValidParentheses(String s) {
6        int maxLen = 0;
7        Deque<Integer> stack = new ArrayDeque<>();
8        stack.push(-1); 
9
10        for (int i = 0; i < s.length(); i++) {
11            if (s.charAt(i) == '(') {
12                stack.push(i);
13            } else {
14                stack.pop();
15                if (stack.isEmpty()) {
16                    stack.push(i); 
17                } else {
18                    maxLen = Math.max(maxLen, i - stack.peek());
19                }
20            }
21        }
22
23        return maxLen;
24    }
25}
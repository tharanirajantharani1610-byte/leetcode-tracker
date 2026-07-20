// Last updated: 20/07/2026, 15:17:52
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<String> generateParenthesis(int n) {
6        List<String> result = new ArrayList<>();
7        backtrack(n, 0, 0, new StringBuilder(), result);
8        return result;
9    }
10
11    private void backtrack(int n, int open, int close, StringBuilder current, List<String> result) {
12        if (current.length() == 2 * n) {
13            result.add(current.toString());
14            return;
15        }
16
17        if (open < n) {
18            current.append('(');
19            backtrack(n, open + 1, close, current, result);
20            current.deleteCharAt(current.length() - 1); 
21        }
22
23        if (close < open) {
24            current.append(')');
25            backtrack(n, open, close + 1, current, result);
26            current.deleteCharAt(current.length() - 1); 
27        }
28    }
29}
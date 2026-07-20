// Last updated: 20/07/2026, 16:16:25
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public String simplifyPath(String path) {
6        Deque<String> stack = new ArrayDeque<>();
7        String[] components = path.split("/");
8
9        for (String dir : components) {
10            if (dir.equals("") || dir.equals(".")) {
11                continue; 
12            } else if (dir.equals("..")) {
13                if (!stack.isEmpty()) {
14                    stack.pop(); 
15                }
16            } else {
17                stack.push(dir); 
18            }
19        }
20
21        StringBuilder result = new StringBuilder();
22        for (String dir : stack) {
23            result.insert(0, "/" + dir);
24        }
25
26        return result.length() == 0 ? "/" : result.toString();
27    }
28}
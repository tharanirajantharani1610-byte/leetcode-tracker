// Last updated: 23/07/2026, 11:01:31
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<String> restoreIpAddresses(String s) {
6        List<String> result = new ArrayList<>();
7        if (s.length() < 4 || s.length() > 12) {
8            return result;
9        }
10        backtrack(s, 0, new ArrayList<>(), result);
11        return result;
12    }
13
14    private void backtrack(String s, int start, List<String> parts, List<String> result) {
15       
16        if (parts.size() == 4) {
17            if (start == s.length()) {
18                result.add(String.join(".", parts));
19            }
20            return;
21        }
22
23        for (int len = 1; len <= 3; len++) {
24            if (start + len > s.length()) {
25                break;
26            }
27
28            String segment = s.substring(start, start + len);
29
30            if (segment.length() > 1 && segment.charAt(0) == '0') {
31                continue;
32            }
33
34            if (Integer.parseInt(segment) > 255) {
35                continue;
36            }
37
38            parts.add(segment);
39            backtrack(s, start + len, parts, result);
40            parts.remove(parts.size() - 1);
41        }
42    }
43}
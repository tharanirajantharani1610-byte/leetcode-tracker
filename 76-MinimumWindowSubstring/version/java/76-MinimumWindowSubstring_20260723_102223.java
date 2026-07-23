// Last updated: 23/07/2026, 10:22:23
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s == null || t == null || s.length() < t.length()) {
4            return "";
5        }
6
7        int[] map = new int[128];
8        for (char c : t.toCharArray()) {
9            map[c]++;
10        }
11
12        int left = 0, right = 0;
13        int count = t.length(); 
14        int minLen = Integer.MAX_VALUE;
15        int minStart = 0;
16
17        while (right < s.length()) {
18            char rightChar = s.charAt(right);
19            
20            
21            if (map[rightChar] > 0) {
22                count--;
23            }
24          
25            map[rightChar]--;
26            right++;
27
28            while (count == 0) {
29                if (right - left < minLen) {
30                    minLen = right - left;
31                    minStart = left;
32                }
33
34                char leftChar = s.charAt(left);
35                map[leftChar]++;
36                
37                if (map[leftChar] > 0) {
38                    count++;
39                }
40                left++; 
41            }
42        }
43
44        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
45    }
46}
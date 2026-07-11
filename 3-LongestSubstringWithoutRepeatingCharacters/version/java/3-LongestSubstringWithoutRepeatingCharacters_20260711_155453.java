// Last updated: 11/07/2026, 15:54:53
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int[] lastIndex = new int[128];
4        int left = 0, maxLength = 0;
5
6        for (int right = 0; right < s.length(); right++) {
7            char ch = s.charAt(right);
8
9            left = Math.max(left, lastIndex[ch]);
10
11            maxLength = Math.max(maxLength, right - left + 1);
12
13            lastIndex[ch] = right + 1;
14        }
15
16        return maxLength;
17    }
18}
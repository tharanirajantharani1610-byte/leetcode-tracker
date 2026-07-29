// Last updated: 29/07/2026, 15:04:10
1class Solution {
2    public String reverseWords(String s) {
3         
4        String[] words = s.trim().split("\\s+");
5        StringBuilder reversed = new StringBuilder();
6
7         for (int i = words.length - 1; i >= 0; i--) {
8            reversed.append(words[i]);
9            if (i > 0) {
10                reversed.append(" ");
11            }
12        }
13
14        return reversed.toString();
15    }
16}
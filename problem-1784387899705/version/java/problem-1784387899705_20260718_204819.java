// Last updated: 18/07/2026, 20:48:19
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder a = new StringBuilder(), b = new StringBuilder(), c = new StringBuilder();
4        for(char ch : s.toCharArray()){
5            if(ch == y) a.append(ch);
6            else if(ch == x) c.append(ch);
7            else b.append(ch);
8        }
9        return a.append(b).append(c).toString();
10    }
11}
// Last updated: 20/07/2026, 10:17:34
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder a = new StringBuilder(), b = new StringBuilder(), c = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == y) a.append(ch);
            else if(ch == x) c.append(ch);
            else b.append(ch);
        }
        return a.append(b).append(c).toString();
    }
}
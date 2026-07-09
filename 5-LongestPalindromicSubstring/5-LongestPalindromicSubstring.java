// Last updated: 09/07/2026, 10:13:26
class Solution {
    static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > res.length()) res = odd;
            if (even.length() > res.length()) res = even;
        }
        return res;
    }
    static String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
        return s.substring(l + 1, r);
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}

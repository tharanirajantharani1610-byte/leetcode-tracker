// Last updated: 29/09/2026, 15:04:53
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5
6        while (left < right) {
7            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
8                left++;
9            }
10            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
11                right--;
12            }
13
14            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
15                return false;
16            }
17
18            left++;
19            right--;
20        }
21
22        return true;
23    }
24}
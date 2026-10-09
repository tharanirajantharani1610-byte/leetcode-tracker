// Last updated: 09/10/2026, 09:10:58
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<String>> partition(String s) {
6        List<List<String>> result = new ArrayList<>();
7        backtrack(0, s, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int start, String s, List<String> currentList, List<List<String>> result) {
12        if (start == s.length()) {
13            result.add(new ArrayList<>(currentList));
14            return;
15        }
16
17        for (int end = start; end < s.length(); end++) {
18            if (isPalindrome(s, start, end)) {
19                currentList.add(s.substring(start, end + 1));
20                backtrack(end + 1, s, currentList, result);
21                currentList.remove(currentList.size() - 1);
22            }
23        }
24    }
25
26    private boolean isPalindrome(String s, int left, int right) {
27        while (left < right) {
28            if (s.charAt(left++) != s.charAt(right--)) {
29                return false;
30            }
31        }
32        return true;
33    }
34}
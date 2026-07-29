// Last updated: 29/07/2026, 14:58:21
1class Solution {
2    public int numDistinct(String s, String t) {
3        int m = s.length();
4        int n = t.length();
5
6         if (m < n) return 0;
7
8        int[][] dp = new int[m + 1][n + 1];
9
10        
11        for (int i = 0; i <= m; i++) {
12            dp[i][0] = 1;
13        }
14
15        for (int i = 1; i <= m; i++) {
16            for (int j = 1; j <= n; j++) {
17                if (s.charAt(i - 1) == t.charAt(j - 1)) {
18                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
19                } else {
20                    dp[i][j] = dp[i - 1][j];
21                }
22            }
23        }
24
25        return dp[m][n];
26    }
27}
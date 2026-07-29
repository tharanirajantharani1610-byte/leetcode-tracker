// Last updated: 29/07/2026, 14:39:14
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length();
4        int n = s2.length();
5        
6        if (m + n != s3.length()) {
7            return false;
8        }
9        
10        boolean[][] dp = new boolean[m + 1][n + 1];
11        
12        dp[0][0] = true;
13        
14        for (int i = 1; i <= m; i++) {
15            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
16        }
17        
18        for (int j = 1; j <= n; j++) {
19            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
20        }
21        
22        for (int i = 1; i <= m; i++) {
23            for (int j = 1; j <= n; j++) {
24                char currentS3 = s3.charAt(i + j - 1);
25                
26                boolean matchS1 = dp[i - 1][j] && s1.charAt(i - 1) == currentS3;
27                boolean matchS2 = dp[i][j - 1] && s2.charAt(j - 1) == currentS3;
28                
29                dp[i][j] = matchS1 || matchS2;
30            }
31        }
32        
33        return dp[m][n];
34    }
35}
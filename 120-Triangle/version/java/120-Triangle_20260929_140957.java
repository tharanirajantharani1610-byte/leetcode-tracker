// Last updated: 29/09/2026, 14:09:57
1import java.util.List;
2
3class Solution {
4    public int minimumTotal(List<List<Integer>> triangle) {
5        int n = triangle.size();
6       
7        int[] dp = new int[n];
8        for (int i = 0; i < n; i++) {
9            dp[i] = triangle.get(n - 1).get(i);
10        }
11
12        for (int row = n - 2; row >= 0; row--) {
13            for (int col = 0; col <= row; col++) {
14                
15                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
16            }
17        }
18
19        return dp[0];
20    }
21}
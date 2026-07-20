// Last updated: 20/07/2026, 10:34:31
class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0L;

        
        long[][] dp = new long[k + 1][3];
        long NEG = Long.MIN_VALUE / 4; 
        for (int t = 0; t <= k; t++) {
            dp[t][0] = 0L;
            dp[t][1] = NEG;
            dp[t][2] = NEG;
        }

        for (int price : prices) {
            long[][] newDp = new long[k + 1][3];
            for (int t = 0; t <= k; t++) {
                newDp[t][0] = dp[t][0];
                newDp[t][1] = dp[t][1];
                newDp[t][2] = dp[t][2];
            }

            for (int t = 1; t <= k; t++) {
                newDp[t][0] = Math.max(newDp[t][0], Math.max(dp[t][1] + price, dp[t][2] - price));
                newDp[t][1] = Math.max(newDp[t][1], dp[t - 1][0] - price);
                newDp[t][2] = Math.max(newDp[t][2], dp[t - 1][0] + price);
            }

            dp = newDp;
        }

        long ans = 0L;
        for (int t = 0; t <= k; t++) {
            ans = Math.max(ans, dp[t][0]);
        }
        return ans;
    }
}
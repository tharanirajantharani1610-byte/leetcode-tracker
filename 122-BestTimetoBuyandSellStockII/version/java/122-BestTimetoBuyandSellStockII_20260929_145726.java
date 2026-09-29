// Last updated: 29/09/2026, 14:57:26
1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxProfit = 0;
4
5        for (int i = 1; i < prices.length; i++) {
6          
7            if (prices[i] > prices[i - 1]) {
8                maxProfit += prices[i] - prices[i - 1];
9            }
10        }
11
12        return maxProfit;
13    }
14}
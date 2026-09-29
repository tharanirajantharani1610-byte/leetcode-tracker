// Last updated: 29/09/2026, 14:18:49
1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = Integer.MAX_VALUE;
4        int maxProfit = 0;
5
6        for (int price : prices) {
7            if (price < minPrice) {
8                
9                minPrice = price;
10            } else if (price - minPrice > maxProfit) {
11              
12                maxProfit = price - minPrice;
13            }
14        }
15
16        return maxProfit;
17    }
18}
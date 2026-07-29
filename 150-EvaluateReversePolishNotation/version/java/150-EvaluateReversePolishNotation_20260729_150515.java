// Last updated: 29/07/2026, 15:05:15
1class Solution {
2    public int maxProduct(int[] nums) {
3        if (nums == null || nums.length == 0) return 0;
4
5        int maxProd = nums[0];
6        int minProd = nums[0];
7        int result = nums[0];
8
9        for (int i = 1; i < nums.length; i++) {
10            int curr = nums[i];
11
12             if (curr < 0) {
13                int temp = maxProd;
14                maxProd = minProd;
15                minProd = temp;
16            }
17
18             
19            maxProd = Math.max(curr, maxProd * curr);
20            minProd = Math.min(curr, minProd * curr);
21
22             result = Math.max(result, maxProd);
23        }
24
25        return result;
26    }
27}
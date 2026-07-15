// Last updated: 15/07/2026, 15:19:56
1class Solution {
2    public int maxArea(int[] height) {
3        int maxWater = 0;
4        int left = 0;
5        int right = height.length - 1;
6        
7        while (left < right) {
8            int width = right - left;
9            
10            int currentWater = Math.min(height[left], height[right]) * width;
11            
12            maxWater = Math.max(maxWater, currentWater);
13            
14            if (height[left] < height[right]) {
15                left++;
16            } else {
17                right--;
18            }
19        }
20        
21        return maxWater;
22    }
23}
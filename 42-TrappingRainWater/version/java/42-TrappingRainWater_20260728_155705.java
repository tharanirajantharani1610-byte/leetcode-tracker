// Last updated: 28/07/2026, 15:57:05
1class Solution {
2    public int trap(int[] height) {
3        if (height == null || height.length == 0) {
4            return 0;
5        }
6
7        int left = 0;
8        int right = height.length - 1;
9
10        int leftMax = 0;
11        int rightMax = 0;
12
13        int totalWater = 0;
14
15        while (left < right) {
16            if (height[left] < height[right]) {
17                if (height[left] >= leftMax) {
18                    leftMax = height[left];
19                } else {
20                    totalWater += leftMax - height[left];
21                }
22                left++;
23            } else {
24                if (height[right] >= rightMax) {
25                    rightMax = height[right];
26                } else {
27                    totalWater += rightMax - height[right];
28                }
29                right--;
30            }
31        }
32
33        return totalWater;
34    }
35}
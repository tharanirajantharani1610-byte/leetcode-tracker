// Last updated: 20/07/2026, 16:12:52
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findBound(nums, target, true);
4        
5        
6        if (first == -1) {
7            return new int[]{-1, -1};
8        }
9        
10        int last = findBound(nums, target, false);
11        return new int[]{first, last};
12    }
13
14    private int findBound(int[] nums, int target, boolean isFirst) {
15        int left = 0;
16        int right = nums.length - 1;
17        int bound = -1;
18
19        while (left <= right) {
20            int mid = left + (right - left) / 2;
21
22            if (nums[mid] == target) {
23                bound = mid; 
24                if (isFirst) {
25                    right = mid - 1; 
26                } else {
27                    left = mid + 1;  
28                }
29            } else if (nums[mid] < target) {
30                left = mid + 1;
31            } else {
32                right = mid - 1;
33            }
34        }
35
36        return bound;
37    }
38}
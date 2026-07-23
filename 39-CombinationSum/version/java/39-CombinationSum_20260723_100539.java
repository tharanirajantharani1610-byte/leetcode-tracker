// Last updated: 23/07/2026, 10:05:39
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        
5        
6        for (int i = 0; i < n; i++) {
7            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
8                int targetIndex = nums[i] - 1;
9                int temp = nums[i];
10                nums[i] = nums[targetIndex];
11                nums[targetIndex] = temp;
12            }
13        }
14        
15        
16        for (int i = 0; i < n; i++) {
17            if (nums[i] != i + 1) {
18                return i + 1;
19            }
20        }
21     
22        return n + 1;
23    }
24}
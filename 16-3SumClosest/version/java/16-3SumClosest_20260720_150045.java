// Last updated: 20/07/2026, 15:00:45
1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6        
7        int closestSum = nums[0] + nums[1] + nums[2];
8        
9        for (int i = 0; i < nums.length - 2; i++) {
10            int left = i + 1;
11            int right = nums.length - 1;
12            
13            while (left < right) {
14                int currentSum = nums[i] + nums[left] + nums[right];
15                
16                if (currentSum == target) {
17                    return currentSum;
18                }
19                
20                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
21                    closestSum = currentSum;
22                }
23                
24                if (currentSum < target) {
25                    left++;
26                } else {
27                    right--;
28                }
29            }
30        }
31        
32        return closestSum;
33    }
34}
// Last updated: 20/07/2026, 10:21:38
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums);
7        
8        for (int i = 0; i < nums.length - 2; i++) {
9            
10            if (nums[i] > 0) break;
11            
12            if (i > 0 && nums[i] == nums[i - 1]) continue;
13            
14            int left = i + 1;
15            int right = nums.length - 1;
16            
17            while (left < right) {
18                int sum = nums[i] + nums[left] + nums[right];
19                
20                if (sum == 0) {
21                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
22                    
23                    while (left < right && nums[left] == nums[left + 1]) left++;
24                    while (left < right && nums[right] == nums[right - 1]) right--;
25                    
26                    left++;
27                    right--;
28                } else if (sum < 0) {
29                    left++; 
30                } else {
31                    right--; 
32                }
33            }
34        }
35        
36        return result;
37    }
38}
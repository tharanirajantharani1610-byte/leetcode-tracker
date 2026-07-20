// Last updated: 20/07/2026, 15:04:54
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.List;
4
5class Solution {
6    public List<List<Integer>> fourSum(int[] nums, int target) {
7        List<List<Integer>> result = new ArrayList<>();
8        if (nums == null || nums.length < 4) {
9            return result;
10        }
11
12        Arrays.sort(nums);
13        int n = nums.length;
14
15        for (int i = 0; i < n - 3; i++) {
16            if (i > 0 && nums[i] == nums[i - 1]) continue;
17
18            for (int j = i + 1; j < n - 2; j++) {
19                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
20
21                int left = j + 1;
22                int right = n - 1;
23
24                while (left < right) {
25                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
26
27                    if (sum == target) {
28                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
29
30                        while (left < right && nums[left] == nums[left + 1]) left++;
31                        while (left < right && nums[right] == nums[right - 1]) right--;
32
33                        left++;
34                        right--;
35                    } else if (sum < target) {
36                        left++;
37                    } else {
38                        right--;
39                    }
40                }
41            }
42        }
43
44        return result;
45    }
46}
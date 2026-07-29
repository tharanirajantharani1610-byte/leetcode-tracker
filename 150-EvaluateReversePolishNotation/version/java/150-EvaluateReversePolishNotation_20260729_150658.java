// Last updated: 29/07/2026, 15:06:58
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] > nums[right]) {
10                 left = mid + 1;
11            } else if (nums[mid] < nums[right]) {
12                 right = mid;
13            } else {
14               
15                right--;
16            }
17        }
18
19        return nums[left];
20    }
21}
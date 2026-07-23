// Last updated: 23/07/2026, 10:20:57
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int high = nums.length - 1;
6
7        while (mid <= high) {
8            if (nums[mid] == 0) {
9                swap(nums, low, mid);
10                low++;
11                mid++;
12            } else if (nums[mid] == 1) {
13                mid++;
14            } else {
15                
16                swap(nums, mid, high);
17                high--;
18            }
19        }
20    }
21
22    private void swap(int[] nums, int i, int j) {
23        int temp = nums[i];
24        nums[i] = nums[j];
25        nums[j] = temp;
26    }
27}
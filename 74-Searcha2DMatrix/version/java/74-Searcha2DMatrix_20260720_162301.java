// Last updated: 20/07/2026, 16:23:01
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
4            return false;
5        }
6
7        int rows = matrix.length;
8        int cols = matrix[0].length;
9
10        int left = 0;
11        int right = rows * cols - 1;
12
13        while (left <= right) {
14            int mid = left + (right - left) / 2;
15            int midVal = matrix[mid / cols][mid % cols];
16
17            if (midVal == target) {
18                return true;
19            } else if (midVal < target) {
20                left = mid + 1;
21            } else {
22                right = mid - 1;
23            }
24        }
25
26        return false;
27    }
28}
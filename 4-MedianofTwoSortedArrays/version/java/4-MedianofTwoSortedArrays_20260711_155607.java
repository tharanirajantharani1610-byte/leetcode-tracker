// Last updated: 11/07/2026, 15:56:07
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        if (nums1.length > nums2.length) {
5            return findMedianSortedArrays(nums2, nums1);
6        }
7
8        int m = nums1.length;
9        int n = nums2.length;
10
11        int low = 0, high = m;
12
13        while (low <= high) {
14
15            int partitionX = (low + high) / 2;
16            int partitionY = (m + n + 1) / 2 - partitionX;
17
18            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
19            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
20
21            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
22            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
23
24            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
25
26                if ((m + n) % 2 == 0) {
27                    return (Math.max(maxLeftX, maxLeftY)
28                            + Math.min(minRightX, minRightY)) / 2.0;
29                } else {
30                    return Math.max(maxLeftX, maxLeftY);
31                }
32
33            } else if (maxLeftX > minRightY) {
34                high = partitionX - 1;
35            } else {
36                low = partitionX + 1;
37            }
38        }
39
40        return 0.0;
41    }
42}
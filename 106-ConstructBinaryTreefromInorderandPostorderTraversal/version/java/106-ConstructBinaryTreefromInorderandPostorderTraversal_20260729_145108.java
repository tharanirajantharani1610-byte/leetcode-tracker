// Last updated: 29/07/2026, 14:51:08
1 
2class Solution {
3    public TreeNode sortedArrayToBST(int[] nums) {
4        if (nums == null || nums.length == 0) {
5            return null;
6        }
7        return buildBST(nums, 0, nums.length - 1);
8    }
9
10    private TreeNode buildBST(int[] nums, int left, int right) {
11        if (left > right) {
12            return null;
13        }
14
15         int mid = left + (right - left) / 2;
16
17        TreeNode root = new TreeNode(nums[mid]);
18        root.left = buildBST(nums, left, mid - 1);
19        root.right = buildBST(nums, mid + 1, right);
20
21        return root;
22    }
23}
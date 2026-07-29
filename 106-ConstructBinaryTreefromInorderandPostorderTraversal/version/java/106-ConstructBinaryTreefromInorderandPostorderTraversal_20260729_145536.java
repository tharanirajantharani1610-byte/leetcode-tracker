// Last updated: 29/07/2026, 14:55:36
1
2class Solution {
3    public boolean hasPathSum(TreeNode root, int targetSum) {
4         if (root == null) {
5            return false;
6        }
7
8         targetSum -= root.val;
9
10         if (root.left == null && root.right == null) {
11            return targetSum == 0;
12        }
13
14        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
15    }
16}
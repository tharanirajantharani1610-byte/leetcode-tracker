// Last updated: 29/07/2026, 14:46:11
1
2class Solution {
3    public int maxDepth(TreeNode root) {
4        if (root == null) {
5            return 0;
6        }
7        
8        int leftDepth = maxDepth(root.left);
9        int rightDepth = maxDepth(root.right);
10        
11        return 1 + Math.max(leftDepth, rightDepth);
12    }
13}
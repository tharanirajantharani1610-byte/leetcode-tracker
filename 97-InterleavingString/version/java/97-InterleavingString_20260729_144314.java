// Last updated: 29/07/2026, 14:43:14
1
2class Solution {
3    public boolean isSymmetric(TreeNode root) {
4        if (root == null) return true;
5        return isMirror(root.left, root.right);
6    }
7
8    private boolean isMirror(TreeNode t1, TreeNode t2) {
9        if (t1 == null && t2 == null) return true;
10        
11        if (t1 == null || t2 == null || t1.val != t2.val) return false;
12
13    
14        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
15    }
16}
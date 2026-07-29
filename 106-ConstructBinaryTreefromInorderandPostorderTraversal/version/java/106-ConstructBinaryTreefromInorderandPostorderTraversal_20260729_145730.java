// Last updated: 29/07/2026, 14:57:30
1 
2class Solution {
3    private TreeNode prev = null;
4
5    public void flatten(TreeNode root) {
6        if (root == null) return;
7
8         flatten(root.right);
9        flatten(root.left);
10
11         root.right = prev;
12        root.left = null;
13        prev = root;
14    }
15}
// Last updated: 29/07/2026, 14:42:16
1
2class Solution {
3    public boolean isSameTree(TreeNode p, TreeNode q) {
4        if (p == null && q == null) {
5            return true;
6        }
7        
8        if (p == null || q == null || p.val != q.val) {
9            return false;
10        }
11        
12      
13        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
14    }
15}
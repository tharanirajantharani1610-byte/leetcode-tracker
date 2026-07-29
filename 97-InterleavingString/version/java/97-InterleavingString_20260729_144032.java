// Last updated: 29/07/2026, 14:40:32
1
2class Solution {
3    public boolean isValidBST(TreeNode root) {
4        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
5    }
6    
7    private boolean validate(TreeNode node, long min, long max) {
8        if (node == null) {
9            return true;
10        }
11        
12        if (node.val <= min || node.val >= max) {
13            return false;
14        }
15        
16        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
17    }
18}
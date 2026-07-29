// Last updated: 29/07/2026, 14:53:46
1
2class Solution {
3    public boolean isBalanced(TreeNode root) {
4        return checkHeight(root) != -1;
5    }
6
7    private int checkHeight(TreeNode node) {
8        if (node == null) {
9            return 0;
10        }
11
12         int leftHeight = checkHeight(node.left);
13        if (leftHeight == -1) {
14            return -1;  
15        }
16
17         int rightHeight = checkHeight(node.right);
18        if (rightHeight == -1) {
19            return -1;  
20        }
21
22         if (Math.abs(leftHeight - rightHeight) > 1) {
23            return -1;
24        }
25
26         return 1 + Math.max(leftHeight, rightHeight);
27    }
28}
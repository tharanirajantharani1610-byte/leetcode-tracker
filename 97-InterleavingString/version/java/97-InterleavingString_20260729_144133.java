// Last updated: 29/07/2026, 14:41:33
1
2class Solution {
3    private TreeNode first = null;
4    private TreeNode second = null;
5    private TreeNode prev = null;
6
7    public void recoverTree(TreeNode root) {
8     
9        inorder(root);
10
11        if (first != null && second != null) {
12            int temp = first.val;
13            first.val = second.val;
14            second.val = temp;
15        }
16    }
17
18    private void inorder(TreeNode root) {
19        if (root == null) return;
20
21        inorder(root.left);
22
23        if (prev != null && prev.val > root.val) {
24            if (first == null) {
25                first = prev;
26            }
27            second = root;
28        }
29        prev = root;
30
31        inorder(root.right);
32    }
33}
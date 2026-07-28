// Last updated: 28/07/2026, 20:29:02
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<Integer> inorderTraversal(TreeNode root) {
6        List<Integer> result = new ArrayList<>();
7        helper(root, result);
8        return result;
9    }
10
11    private void helper(TreeNode root, List<Integer> result) {
12        if (root == null) {
13            return;
14        }
15        
16        helper(root.left, result);
17        
18        result.add(root.val);
19        
20        helper(root.right, result);
21    }
22}
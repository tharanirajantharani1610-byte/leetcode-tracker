// Last updated: 28/07/2026, 20:30:27
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<TreeNode> generateTrees(int n) {
6        if (n == 0) return new ArrayList<>();
7        return buildTrees(1, n);
8    }
9
10    private List<TreeNode> buildTrees(int start, int end) {
11        List<TreeNode> allTrees = new ArrayList<>();
12
13        if (start > end) {
14            allTrees.add(null);
15            return allTrees;
16        }
17
18        for (int i = start; i <= end; i++) {
19            List<TreeNode> leftSubtrees = buildTrees(start, i - 1);
20            List<TreeNode> rightSubtrees = buildTrees(i + 1, end);
21
22            for (TreeNode left : leftSubtrees) {
23                for (TreeNode right : rightSubtrees) {
24                    TreeNode root = new TreeNode(i);
25                    root.left = left;
26                    root.right = right;
27                    allTrees.add(root);
28                }
29            }
30        }
31
32        return allTrees;
33    }
34}
// Last updated: 29/07/2026, 14:54:42
1
2class Solution {
3    public int minDepth(TreeNode root) {
4        if (root == null) return 0;
5
6        Queue<TreeNode> queue = new LinkedList<>();
7        queue.add(root);
8        int depth = 1;
9
10        while (!queue.isEmpty()) {
11            int levelSize = queue.size();
12
13            for (int i = 0; i < levelSize; i++) {
14                TreeNode current = queue.poll();
15
16                if (current.left == null && current.right == null) {
17                    return depth;
18                }
19
20                if (current.left != null) queue.add(current.left);
21                if (current.right != null) queue.add(current.right);
22            }
23
24            depth++;
25        }
26
27        return depth;
28    }
29}
// Last updated: 29/07/2026, 14:50:05
1
2class Solution {
3    public List<List<Integer>> levelOrderBottom(TreeNode root) {
4        LinkedList<List<Integer>> result = new LinkedList<>();
5        if (root == null) return result;
6
7        Queue<TreeNode> queue = new LinkedList<>();
8        queue.add(root);
9
10        while (!queue.isEmpty()) {
11            int levelSize = queue.size();
12            List<Integer> currentLevel = new ArrayList<>();
13
14            for (int i = 0; i < levelSize; i++) {
15                TreeNode currentNode = queue.poll();
16                currentLevel.add(currentNode.val);
17
18                if (currentNode.left != null) {
19                    queue.add(currentNode.left);
20                }
21                if (currentNode.right != null) {
22                    queue.add(currentNode.right);
23                }
24            }
25
26             result.addFirst(currentLevel);
27        }
28
29        return result;
30    }
31}
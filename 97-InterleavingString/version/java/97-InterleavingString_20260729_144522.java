// Last updated: 29/07/2026, 14:45:22
1
2class Solution {
3    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
4        List<List<Integer>> result = new ArrayList<>();
5        if (root == null) return result;
6
7        Queue<TreeNode> queue = new LinkedList<>();
8        queue.add(root);
9        boolean leftToRight = true;
10
11        while (!queue.isEmpty()) {
12            int levelSize = queue.size();
13            LinkedList<Integer> currentLevel = new LinkedList<>();
14
15            for (int i = 0; i < levelSize; i++) {
16                TreeNode currentNode = queue.poll();
17
18                if (leftToRight) {
19                    currentLevel.add(currentNode.val); 
20                } else {
21                    currentLevel.addFirst(currentNode.val); // 
22                }
23
24                if (currentNode.left != null) {
25                    queue.add(currentNode.left);
26                }
27                if (currentNode.right != null) {
28                    queue.add(currentNode.right);
29                }
30            }
31
32            result.add(currentLevel);
33            leftToRight = !leftToRight; 
34        }
35
36        return result;
37    }
38}
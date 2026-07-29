// Last updated: 29/07/2026, 14:56:38
1 
2class Solution {
3    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
4        List<List<Integer>> result = new ArrayList<>();
5        List<Integer> currentPath = new ArrayList<>();
6        findPaths(root, targetSum, currentPath, result);
7        return result;
8    }
9
10    private void findPaths(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
11        if (node == null) {
12            return;
13        }
14
15         currentPath.add(node.val);
16        targetSum -= node.val;
17
18         if (node.left == null && node.right == null && targetSum == 0) {
19            result.add(new ArrayList<>(currentPath));  
20        } else {
21             findPaths(node.left, targetSum, currentPath, result);
22            findPaths(node.right, targetSum, currentPath, result);
23        }
24
25      
26        currentPath.remove(currentPath.size() - 1);
27    }
28}
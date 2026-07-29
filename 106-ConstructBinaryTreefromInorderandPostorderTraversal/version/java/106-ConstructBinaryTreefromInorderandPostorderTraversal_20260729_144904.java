// Last updated: 29/07/2026, 14:49:04
1
2class Solution {
3    private int postorderIndex;
4    private Map<Integer, Integer> inorderIndexMap;
5
6    public TreeNode buildTree(int[] inorder, int[] postorder) {
7        postorderIndex = postorder.length - 1;
8        inorderIndexMap = new HashMap<>();
9
10        for (int i = 0; i < inorder.length; i++) {
11            inorderIndexMap.put(inorder[i], i);
12        }
13
14        return arrayToTree(postorder, 0, inorder.length - 1);
15    }
16
17    private TreeNode arrayToTree(int[] postorder, int left, int right) {
18        if (left > right) {
19            return null;
20        }
21
22        int rootVal = postorder[postorderIndex--];
23        TreeNode root = new TreeNode(rootVal);
24
25        
26        int rootIndex = inorderIndexMap.get(rootVal);
27
28        root.right = arrayToTree(postorder, rootIndex + 1, right);
29        root.left = arrayToTree(postorder, left, rootIndex - 1);
30
31        return root;
32    }
33}
// Last updated: 29/07/2026, 14:48:03
1
2class Solution {
3    private int preorderIndex;
4    private Map<Integer, Integer> inorderIndexMap;
5
6    public TreeNode buildTree(int[] preorder, int[] inorder) {
7        preorderIndex = 0;
8        inorderIndexMap = new HashMap<>();
9
10     
11        for (int i = 0; i < inorder.length; i++) {
12            inorderIndexMap.put(inorder[i], i);
13        }
14
15        return arrayToTree(preorder, 0, inorder.length - 1);
16    }
17
18    private TreeNode arrayToTree(int[] preorder, int left, int right) {
19        if (left > right) {
20            return null;
21        }
22
23        int rootVal = preorder[preorderIndex++];
24        TreeNode root = new TreeNode(rootVal);
25
26      
27        int rootIndex = inorderIndexMap.get(rootVal);
28
29        root.left = arrayToTree(preorder, left, rootIndex - 1);
30        root.right = arrayToTree(preorder, rootIndex + 1, right);
31
32        return root;
33    }
34}
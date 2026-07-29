// Last updated: 29/07/2026, 14:59:22
1
2
3class Solution {
4    public Node connect(Node root) {
5        if (root == null) return null;
6
7         Node leftmost = root;
8
9         while (leftmost.left != null) {
10            Node head = leftmost;
11
12            while (head != null) {
13                 head.left.next = head.right;
14
15               
16                if (head.next != null) {
17                    head.right.next = head.next.left;
18                }
19
20                 head = head.next;
21            }
22
23             leftmost = leftmost.left;
24        }
25
26        return root;
27    }
28}
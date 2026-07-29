// Last updated: 29/07/2026, 15:00:37
1 
2class Solution {
3    public Node connect(Node root) {
4        if (root == null) return null;
5
6        Node curr = root;  
7        while (curr != null) {
8            Node dummyHead = new Node(0);  
9            Node tail = dummyHead;        
10
11             while (curr != null) {
12                if (curr.left != null) {
13                    tail.next = curr.left;
14                    tail = tail.next;
15                }
16                if (curr.right != null) {
17                    tail.next = curr.right;
18                    tail = tail.next;
19                }
20                curr = curr.next;  
21            }
22
23             curr = dummyHead.next;
24        }
25
26        return root;
27    }
28}
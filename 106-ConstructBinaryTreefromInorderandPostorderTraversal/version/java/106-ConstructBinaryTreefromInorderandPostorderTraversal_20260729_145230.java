// Last updated: 29/07/2026, 14:52:30
1
2class Solution {
3    public TreeNode sortedListToBST(ListNode head) {
4        if (head == null) return null;
5        if (head.next == null) return new TreeNode(head.val);
6
7         ListNode prev = null;
8        ListNode slow = head;
9        ListNode fast = head;
10
11        while (fast != null && fast.next != null) {
12            prev = slow;
13            slow = slow.next;
14            fast = fast.next.next;
15        }
16
17         if (prev != null) {
18            prev.next = null;
19        }
20
21        TreeNode root = new TreeNode(slow.val);
22
23         root.left = sortedListToBST(head);
24        root.right = sortedListToBST(slow.next);
25
26        return root;
27    }
28}
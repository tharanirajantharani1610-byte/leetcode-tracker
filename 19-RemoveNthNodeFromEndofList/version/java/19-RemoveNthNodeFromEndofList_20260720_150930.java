// Last updated: 20/07/2026, 15:09:30
1
2class Solution {
3    public ListNode removeNthFromEnd(ListNode head, int n) {
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode fast = dummy;
8        ListNode slow = dummy;
9
10        
11        for (int i = 0; i <= n; i++) {
12            fast = fast.next;
13        }
14
15        while (fast != null) {
16            fast = fast.next;
17            slow = slow.next;
18        }
19
20        slow.next = slow.next.next;
21
22        return dummy.next;
23    }
24}
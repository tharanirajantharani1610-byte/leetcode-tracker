// Last updated: 23/07/2026, 10:59:05
1
2class Solution {
3    public ListNode reverseBetween(ListNode head, int left, int right) {
4        if (head == null || left == right) {
5            return head;
6        }
7
8        ListNode dummy = new ListNode(0);
9        dummy.next = head;
10        ListNode prev = dummy;
11
12       
13        for (int i = 0; i < left - 1; i++) {
14            prev = prev.next;
15        }
16
17        
18        ListNode start = prev.next;
19        
20        ListNode then = start.next;
21
22        for (int i = 0; i < right - left; i++) {
23            start.next = then.next;
24            then.next = prev.next;
25            prev.next = then;
26            then = start.next;
27        }
28
29        return dummy.next;
30    }
31}
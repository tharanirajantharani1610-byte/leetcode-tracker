// Last updated: 20/07/2026, 15:19:55
1
2class Solution {
3    public ListNode swapPairs(ListNode head) {
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6        ListNode prev = dummy;
7
8        while (prev.next != null && prev.next.next != null) {
9            ListNode first = prev.next;
10            ListNode second = prev.next.next;
11
12            first.next = second.next;
13            second.next = first;
14            prev.next = second;
15
16            prev = first;
17        }
18
19        return dummy.next;
20    }
21}
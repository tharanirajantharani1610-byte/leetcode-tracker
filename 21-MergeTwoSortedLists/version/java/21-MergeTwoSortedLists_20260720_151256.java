// Last updated: 20/07/2026, 15:12:56
1
2class Solution {
3    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
4        ListNode dummy = new ListNode(0);
5        ListNode current = dummy;
6
7        while (list1 != null && list2 != null) {
8            if (list1.val <= list2.val) {
9                current.next = list1;
10                list1 = list1.next;
11            } else {
12                current.next = list2;
13                list2 = list2.next;
14            }
15            current = current.next;
16        }
17
18        if (list1 != null) {
19            current.next = list1;
20        } else if (list2 != null) {
21            current.next = list2;
22        }
23
24        return dummy.next;
25    }
26}
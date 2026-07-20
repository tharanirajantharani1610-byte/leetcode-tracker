// Last updated: 20/07/2026, 15:06:14
1import java.util.PriorityQueue;
2class Solution {
3    public ListNode mergeKLists(ListNode[] lists) {
4        if (lists == null || lists.length == 0) {
5            return null;
6        }
7
8         PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
9            (a, b) -> Integer.compare(a.val, b.val)
10        );
11
12         for (ListNode list : lists) {
13            if (list != null) {
14                minHeap.add(list);
15            }
16        }
17
18        ListNode dummy = new ListNode(0);
19        ListNode current = dummy;
20
21         while (!minHeap.isEmpty()) {
22            ListNode smallest = minHeap.poll();
23            current.next = smallest;
24            current = current.next;
25
26             if (smallest.next != null) {
27                minHeap.add(smallest.next);
28            }
29        }
30
31        return dummy.next;
32    }
33}
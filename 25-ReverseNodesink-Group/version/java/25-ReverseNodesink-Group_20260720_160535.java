// Last updated: 20/07/2026, 16:05:35
1
2class Solution {
3    public ListNode reverseKGroup(ListNode head, int k) {
4        if (head == null || k == 1) return head;
5
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8        ListNode prevGroupTail = dummy;
9
10        while (true) {
11            ListNode kth = getKthNode(prevGroupTail, k);
12            if (kth == null) {
13                break; 
14            }
15
16            ListNode nextGroupHead = kth.next; 
17            ListNode currentGroupHead = prevGroupTail.next; 
18
19            ListNode prev = nextGroupHead;
20            ListNode curr = currentGroupHead;
21            while (curr != nextGroupHead) {
22                ListNode nextTemp = curr.next;
23                curr.next = prev;
24                prev = curr;
25                curr = nextTemp;
26            }
27
28           
29            prevGroupTail.next = kth;
30            prevGroupTail = currentGroupHead; 
31        }
32
33        return dummy.next;
34    }
35
36    private ListNode getKthNode(ListNode curr, int k) {
37        while (curr != null && k > 0) {
38            curr = curr.next;
39            k--;
40        }
41        return curr;
42    }
43}
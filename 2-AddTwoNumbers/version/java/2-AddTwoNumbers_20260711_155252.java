// Last updated: 11/07/2026, 15:52:52
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
17        ListNode dummy = new ListNode(0);
18        ListNode current = dummy;
19        int carry = 0;
20
21        while (l1 != null || l2 != null || carry != 0) {
22            int sum = carry;
23
24            if (l1 != null) {
25                sum += l1.val;
26                l1 = l1.next;
27            }
28
29            if (l2 != null) {
30                sum += l2.val;
31                l2 = l2.next;
32            }
33
34            carry = sum / 10;
35            current.next = new ListNode(sum % 10);
36            current = current.next;
37        }
38
39        return dummy.next;
40    }
41}
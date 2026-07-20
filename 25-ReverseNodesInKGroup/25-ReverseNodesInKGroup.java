// Last updated: 20/07/2026, 16:24:45

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy;

        while (true) {
            ListNode kth = getKthNode(prevGroupTail, k);
            if (kth == null) {
                break; 
            }

            ListNode nextGroupHead = kth.next; 
            ListNode currentGroupHead = prevGroupTail.next; 

            ListNode prev = nextGroupHead;
            ListNode curr = currentGroupHead;
            while (curr != nextGroupHead) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }

           
            prevGroupTail.next = kth;
            prevGroupTail = currentGroupHead; 
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
public class DeletingDuplicatesRecursively {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        if(head.val == head.next.val) {

            ListNode temp = head.next.next;
            head.next = null;
            head.next = temp;
            deleteDuplicates(head);

        } else {

            deleteDuplicates(head.next);

        }
        return head;
    }
}


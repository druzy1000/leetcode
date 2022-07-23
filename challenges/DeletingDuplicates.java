public class DeletingDuplicates {
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

        ListNode current = head;

        if (current == null) {
            return null;
        }

        while(current.next != null) {

            if(current.val == current.next.val) {

                ListNode temp = current.next;
                current.next = temp.next;

            } else {

                current = current.next;

            }
        }
        return head;
    }
}


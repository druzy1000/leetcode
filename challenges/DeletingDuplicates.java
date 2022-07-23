public class DeletingDuplicates {

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


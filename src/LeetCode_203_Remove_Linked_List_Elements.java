public class LeetCode_203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return null;

        ListNode pointer = head;
        while (pointer.next != null) {
            if (pointer.next.val == val)
                pointer.next = pointer.next.next;
            else
                pointer = pointer.next;
        }
        if (head.val == val) return head.next;
        return head;
    }
}

public class LeetCode_206_Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode back = head;
        ListNode front = back.next;
        head.next = null;

        while(front!=null && back!= null)
        {
            ListNode next = front.next;
            front.next = back;
            back = front;
            front = next;
        }
        return back;
    }
}
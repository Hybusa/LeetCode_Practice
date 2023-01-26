public class LeetCode_83_Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;

        ListNode pointer = head;
        while(pointer.next != null)
        {
            if(pointer.next.val == pointer.val)
                pointer.next = pointer.next.next;
            else
                pointer = pointer.next;
        }
        return head;
    }
}

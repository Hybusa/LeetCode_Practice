public class LeetCode_234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {

        ListNode rabbit = head;
        ListNode turtle = rabbit;

        while (rabbit!=null && rabbit.next!=null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }

        ListNode back = turtle;
        ListNode front = back.next;
        back.next = null;

        while(front!=null && back!= null)
        {
            ListNode next = front.next;
            front.next = back;
            back = front;
            front = next;
        }

        ListNode begining = head;
        ListNode end = back;

        while (end!=null)
        {
            if(begining.val != end.val)
                return false;
            begining = begining.next;
            end = end.next;
        }
        return true;
    }
}

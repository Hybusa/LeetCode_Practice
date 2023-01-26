public class LeetCode_876_Middle_of_the_Linked_List {
    public static ListNode middleNode(ListNode head) {
        ListNode rabbit = head;
        ListNode turtle = rabbit;

        while (rabbit!=null && rabbit.next!=null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        return turtle;
    }
}

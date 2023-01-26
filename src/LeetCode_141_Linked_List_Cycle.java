import java.util.HashSet;
import java.util.Set;

public class LeetCode_141_Linked_List_Cycle {

    public static boolean hasCycle(ListNode2 head) {
        Set<ListNode2> set = new HashSet<>();

        while (head!=null)
        {
            if(!set.add(head))
                return true;

            head = head.next;
        }
        return false;
    }

    //Rabbit  and Turtle
    public boolean hasCycle2(ListNode2 head) {
        ListNode2 rabbit = head;
        ListNode2 turtle = head;
        while(rabbit != null && rabbit.next != null){
            rabbit = rabbit.next.next; //2 times
            turtle = turtle.next;
            if(rabbit == turtle)
                return true;
        }
        return false;
    }
}

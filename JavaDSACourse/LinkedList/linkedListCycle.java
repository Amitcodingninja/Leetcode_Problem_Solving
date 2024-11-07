package JavaDSACourse.LinkedList;
//141
public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null) return false;
        if (head.next == null) return false;

        ListNode slow = head; // Pointer moving one step at a time
        ListNode fast = head; // Pointer moving two steps at a time

        while (fast != null) {
            // Check if slow pointer is null (this check is not needed here)
            if (slow == null) return false; // This line is not necessary due to the while condition

            slow = slow.next; // Move slow pointer one step

            // Check if fast pointer can move two steps
            if (fast.next == null) return false;
            fast = fast.next.next; // Move fast pointer two steps

            // Check if slow and fast pointers meet, indicating a cycle
            if (fast == slow) return true;
        }

        return false; // No cycle found
    }


    public static void main(String[] args) {

    }
}

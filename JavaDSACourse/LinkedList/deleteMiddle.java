package JavaDSACourse.LinkedList;
// 2095
public class deleteMiddle {
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) {
                return null; // Return null if the list is empty or has one node
            }

            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null; // Keep track of the previous node

            while (fast != null && fast.next != null) {
                prev = slow;          // Store the previous node
                slow = slow.next;     // Move slow one step
                fast = fast.next.next; // Move fast two steps
            }

            // Remove the middle node
            prev.next = slow.next; // Connect the previous node to the next of slow

            return head; // Return the modified list
        }
    }

}

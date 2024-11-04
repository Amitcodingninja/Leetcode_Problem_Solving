package JavaDSACourse.LinkedList;

import java.util.Arrays;

public class middleOfLinkedList {
    // Node class for Linked List
    public static class ListNode {
        int data;
        ListNode next; // Points to the next node in the list

        ListNode(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }

    // Method to find the middle node of a linked list
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move 'fast' two steps and 'slow' one step at a time until 'fast' reaches the end
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 'slow' will now point to the middle node
        return slow;
    }

    // Method to display the linked list starting from the given head node
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // Print data of each node
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // New line at the end of the list
    }

    public static void main(String[] args) {
        // Creating List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
//        list.next.next.next.next.next = new ListNode(6);

        // Display the list
        System.out.print("List: ");
        display(list);

        // Find and display the middle node
        ListNode middle = middleNode(list);
        System.out.println("Middle node value: " + middle.data);
    }
}

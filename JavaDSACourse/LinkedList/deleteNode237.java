package JavaDSACourse.LinkedList;

// Definition for singly-linked list node.
class ListNode {
    int val; // Value of the node
    ListNode next; // Pointer to the next node in the list

    // Constructor to initialize a node with a given value
    ListNode(int val) {
        this.val = val; // Set the node's value
        this.next = null; // Initialize the next pointer to null
    }
}

public class deleteNode237 {
    public static void main(String[] args) {
        // Creating a linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        // Delete the node with value 5 (the second node)
        deleteNode(head.next);

        // Print the linked list after deletion
        printList(head); // Expected output: 4 -> 1 -> 9
    }

    // Method to delete a node from the linked list
    public static void deleteNode(ListNode node) {
        // Replace the value of the node to be deleted with the next node's value
        node.val = node.next.val;
        // Skip the next node in the list
        node.next = node.next.next;
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head; // Start with the head of the list
        while (current != null) { // Traverse the list until the end
            System.out.print(current.val + " -> "); // Print current node's value
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }
}

package JavaDSACourse.LinkedList;

public class intersectionOfTwoLinedList {

    // Node class for Linked List
    public static class ListNode {
        int data;
        ListNode next; // Points to the next node in the list

        ListNode(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }

    // Method to find the intersection point of two linked lists
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        // Calculate the length of list A
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        // Calculate the length of list B
        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        // Reset pointers to the start of each list
        tempA = headA;
        tempB = headB;

        // Align both lists by moving the pointer of the longer list
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next; // Move tempA forward by the difference in lengths
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next; // Move tempB forward by the difference in lengths
            }
        }

        // Traverse both lists together until the intersection is found
        while (tempA != null && tempB != null) {
            if (tempA == tempB) { // Check if nodes are the same, indicating intersection
                return tempA; // Return the intersection node
            }
            tempA = tempA.next; // Move both pointers forward
            tempB = tempB.next;
        }

        return null; // No intersection found, return null
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
        // Example usage:

        // Creating List A: 1 -> 2 -> 3
        ListNode listA = new ListNode(1);
        listA.next = new ListNode(2);
        listA.next.next = new ListNode(3);

        // Creating List B: 4 -> 5 -> intersection at node with value 2
        ListNode listB = new ListNode(4);
        listB.next = new ListNode(5);
        listB.next.next = listA.next; // Setting the intersection point

        // Find and display the intersection node
        ListNode intersection = getIntersectionNode(listA, listB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection.");
        }

        // Display both lists
        System.out.print("List A: ");
        display(listA);
        System.out.print("List B: ");
        display(listB);
    }
}

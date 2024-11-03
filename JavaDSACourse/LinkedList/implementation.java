package JavaDSACourse.LinkedList;

public class implementation {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;
        implementation.Node next;

        Node(int data) {
            this.data = data; // Initialize node with given data
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        // Insert a new node with value 'val' at the end of the list
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) { // If list is empty, set head and tail to the new node
                head = temp;
                tail = temp;
            } else {
                tail.next = temp; // Link new node at the end and update tail
                tail = temp;
            }
        }

        // Insert a new node with value 'val' at the beginning of the list
        void insertAtBegining(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val); // If list is empty, insert at end
            } else {
                temp.next = head; // Link new node to the current head and update head
                head = temp;
            }
        }

        // Insert a new node with value 'val' at a specified index
        void insertAtIndex(int idx, int val) {
            if (idx < 0 || idx > size()) { // Check for invalid index
                System.out.println("Wrong Index");
                return;
            }

            if (idx == size()) { // If index is at the end, insert at the end
                insertAtEnd(val);
                return;
            } else if (idx == 0) { // If index is at the beginning, insert at the beginning
                insertAtBegining(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) { // Traverse to the node before the target index
                temp = temp.next;
            }
            Node t = new Node(val); // Create a new node
            t.next = temp.next; // Link new node to the next node
            temp.next = t; // Link previous node to the new node
        }

        // Retrieve the data at a specific index
        int getAt(int idx) {
            if (idx < 0 || idx >= size()) { // Check for out-of-bounds index
                System.out.println("Index out of bounds");
                return -1;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) { // Traverse to the target index
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete the node at a specific index
        void deleteAt(int idx) {
            if (idx < 0 || idx >= size()) { // Check for out-of-bounds index
                System.out.println("Index out of bounds");
                return;
            }

            if (idx == 0) { // If deleting the first node, update head
                head = head.next;
                return;
            }

            Node temp = head;
            for (int i = 1; i < idx; i++) { // Traverse to the node before the target index
                temp = temp.next;
            }

            if (temp.next.next == null) { // If deleting the last node, update tail
                tail = temp;
            }

            temp.next = temp.next.next; // Remove the target node by updating links
        }

        // Display all elements in the linked list
        void display() {
            Node temp = head;
            while (temp != null) { // Traverse the list and print each node's data
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Calculate the size of the linked list
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) { // Traverse and count each node
                count++;
                temp = temp.next;
            }
            return count;
        }
    }


    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(0);
        ll.insertAtBegining(89);
        ll.insertAtIndex(2, 100);

//        System.out.println(ll.size());
        ll.insertAtEnd(10);
        ll.deleteAt(0);
        ll.display();
//        System.out.println(ll.size());
//        System.out.println(ll.getAt(1));
//        System.out.println(ll.getAt(0));


    }
}
